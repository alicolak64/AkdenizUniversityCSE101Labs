import java.util.Scanner;

/*
 * @author Ali Çolak
 * 15.12.2020
 */

public class Lab07_20190808064 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array : ");

        int [] array = new int [scanner.nextInt()];

        for( int i = 0 ; i < array.length ; i++ ){

            System.out.print("Enter the "+(i+1)+  ". element of the array:");
            array[i]=scanner.nextInt();

        }

        System.out.println("Your array is : "+toString(array));
        System.out.println("Sum of the array : "+sum(array));
        System.out.println("Average of the array : "+avg(array));
        System.out.println("Min value of the array : "+minValue(array));
        System.out.println("Max value of the array : "+maxValue(array));

    }

    public static int maxValue(int[] array) {

        int maxValue = array[0];

        for( int i = 0 ; i < array.length ; i++ ){

            if( maxValue < array[i] ){

                maxValue = array[i];

            }

        }

        return maxValue;

    }

    public static int minValue(int[] array) {

        int minValue = array[0];

        for( int i = 0 ; i < array.length ; i++ ){

            if( minValue > array[i] ){

                minValue = array[i];

            }

        }

        return minValue;
    }

    public static double avg(int[] array) {

        double sum = 0;

        for( int i = 0 ; i < array.length ; i++ ){

            sum+=array[i];

        }

        return sum / array.length ;
    }

    public static int sum(int[] array) {

        int sum = 0;

        for( int i = 0 ; i < array.length ; i++ ){

            sum += array[i];

        }

        return sum;

    }

    public static String toString(int[] array) {

        String str = "";

        for( int i = 0 ; i < array.length ; i++ ) {

            str+=array[i];

            if( i != (array.length-1) ) {

                str += ",";

            }

        }

        return str;

    }
}
