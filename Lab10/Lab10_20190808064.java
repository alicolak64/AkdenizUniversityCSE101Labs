package LabExercises;

import java.util.Scanner;

/**
 * @author Ali Çolak
 * 17.12.2020
 */
public class Lab10_20190808064 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of row : ");
        int row = scanner.nextInt();
        
        System.out.print("Enter the value of column : ");
        int column = scanner.nextInt();
        
        int [][] array = new int[column][row];
        
        for( int i = 0 ; i < array.length ; i++ ) {
            
            for ( int j = 0 ; j < array[0].length ; j++ ) {
                
                System.out.print("Enter the value in row "+(i+1)+" of column "+(j+1)+" : ");
                array[i][j]=scanner.nextInt();
                
            }
            
        }
        
        findOverAvgRows(array);
        
        findBelowAvg(array);
        
    }
    
    public static void findOverAvgRows ( int [][] array ){
        
        for ( int i = 0 ; i < array.length ; i++ ) {
            
            System.out.print("Row "+(i)+" : ");
            
            int sum = 0 ;
            
            for ( double j : array[0] )
                sum += j;
            
            double avarage = (double) sum / array[i].length ;
            
            String str = "" ;
            
            for ( int j = 0; j < array[i].length ; j++ ) {
                
                if (array[i][j]>avarage)
                    str += "index " + j + ": " + array[i][j] + ", " ;
                
            }
            
            if ( str.equals("") ) 
                System.out.println("Not found ");
            else 
                System.out.println( str.substring( 0 , str.length()-2 ) );
        }
    }
    
    public static void findBelowAvg( int [][] array ){
        
        for ( int i = 0 ;i < array[0].length ; i++ ){
            
            System.out.print("Column " + i + " : ");
            int sum = 0;
            
            for (int[] ints : array) {
                
                sum += ints[i];
                
            }
            
            double avarage=(double) sum/array.length;
            
            String str = "" ;
            
            for ( int j = 0; j < array.length ; j++ ) {
                
                if ( array[j][i] < avarage )
                    str += "index " + j + ": " + array[j][i] + ", " ;
                
            }
            if (str.equals("")) 
                System.out.println("Not found ");
            else 
                System.out.println( str.substring ( 0 , str.length()-2 ) );
        }
    }
}