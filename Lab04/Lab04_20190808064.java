import java.util.Scanner;

/**
 * @author Ali Çolak
 * 17.11.2020
 */

public class Lab04_20190808064 {
    public static void main(String[] args) {
        Scanner gir=new Scanner (System.in);
        int toplam=0;
        System.out.println("Please enter any number");
        int sayı=gir.nextInt();
        for(int i=1;i<sayı;i++){
            if(sayı%i==0)
                toplam=toplam+i;
        }
        if(toplam==sayı)
            System.out.println("valid");
        else
            System.out.println("not valid");
    }
}
