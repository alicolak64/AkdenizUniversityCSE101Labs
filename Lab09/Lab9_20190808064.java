import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Ali Çolak
 * 17.12.2020
 */

public class Lab9_20190808064 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of column : ");
        int column = scanner.nextInt();
        
        System.out.print("Enter the value of row : ");
        int row = scanner.nextInt();
        
        int [][] array = new int [column][row];
        
        for( int i = 0 ; i < array.length ; i++ ) {
            
            for (int j = 0 ; j < array[0].length ; j++ ) {
                
                System.out.print("Enter the value in row "+(i+1)+" of column "+(j+1)+" : ");
                
                array[i][j] = scanner.nextInt();
                
            }
            
        }
        
        findDuplicateColumn(array);
        
        findDuplicateRows(array);
        
    }
    
    public static void findDuplicateColumn (int [][] array){
        
        boolean isDuplicate = false;
        int counter = 0;
        
        int newArray [][] = new int [array[0].length][array.length];
        
        for (int i = 0 ; i < array[0].length ; i++ ){
            
            for (int j=0;j< array.length;j++){
                
                newArray[i][j]=array[j][i];
                
            }
            
        }
        
        for (int i = 0 ; i < newArray.length ; i++ ) {
            
            second:
            for ( int j=i+1 ; j< newArray.length ; j++ ) {
                
                counter=0;
                
                for ( int k = 0 ; x < newArray[j].length ; k++ ){
                    
                    if ( newArray[i][k] == newArray[j][k] ) 
                        counter++;
                    else 
                        continue second;
                }
                
                if ( counter == newArray[j].length ) {
                    
                    isDuplicate=true;
                    
                    System.out.print("Duplicate found! index "+i+" and "+j+"; ");
                    
                    for ( int y : newArray[i] ) {
                        System.out.print(y+" ");
                    }
                    
                    System.out.println("\n");
                    
                }
                
            }
            
        }
        
        if ( !isDuplicate )
            System.out.println("Duplicate not found!");
        
    }
    
    public static void findDuplicateRows(int [][] array){
        
        boolean isDuplicate=false;
        int counter=0;
        
        for (int i = 0 ; i < array.length  ;i++ ){

            second:
            for ( int j = i+1 ; j < array.length ; j++ ) {
                
                counter=0;
                
                for ( int x = 0 ; x < array[j].length ; x++ ){
                    
                    if (array[i][x]==array[j][x]) 
                        counter++;
                    else 
                        continue second;
                    
                }
                
                if ( counter == array[j].length ) {
                    
                    isDuplicate=true;
                    
                    System.out.println("Duplicate found! index "+i+" and "+j+"; ");
                    
                    for ( int y:array[i] ) {
                        
                        System.out.println(y+" ");
                        
                    }
                    
                }
                
            }
            
        }
        
        if( !isDuplicate )
            System.out.println("Duplicate not found!");
        
    }
}
