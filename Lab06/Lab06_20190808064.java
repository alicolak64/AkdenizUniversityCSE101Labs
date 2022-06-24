import java.util.Scanner;

/*
 * @author Ali Çolak
 * 1.12.2020
 */

public class Lab06_20190808064 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(password(scanner.nextLine()));

    }

    public static String password(String str) {

        String encrypted ="";
        String odd;
        String even;

        if (str.length() % 2 == 0) {

            for (int i = 0; i < str.length(); i+=2) {

                odd = str.substring(i,i+1);
                even= str.substring(i+1,i+2);
                encrypted = encrypted + even + odd;

            }

            return encrypted;

        } else {

            str += " ";

            for (int i = 0; i < str.length(); i += 2) {

                odd = str.substring(i,i+1);
                even= str.substring(i+1,i+2);
                encrypted = encrypted + even + odd;

            }

            return encrypted;

        }

    }
}
