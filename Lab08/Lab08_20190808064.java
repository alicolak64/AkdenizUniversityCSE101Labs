import java.util.Scanner;

/*
 * @author Ali Çolak
 * 22.12.2020
 */

public class Lab08_20190808064 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        
        System.out.print("Direction : ");
        String direction = scanner.nextLine();
        
        if ( ! ( direction.equals("right") || (direction.equals("left")) ) ) {
            
            System.out.println("You entered wrong direction value");
            System.exit(0);
            
        }
        
        System.out.print("K:");
        int k = scanner.nextInt();
        
        if( k < 0 || k > array.length ){
            
            System.out.println("You entered wrong k value");
            System.exit(0);
            
        }
        
        int [] array = transform( array , direction , k );
        
        System.out.print("New array is : ");
        
        for ( int i = 0 ; i < array.length ; i++ ) {
            
            System.out.print(array[i]);
            
            if(i!= array.length-1)
                System.out.print(",");
            
        }
        
    }
    
    public static int [] transform (int [] a , String str, int k ) {
        
        int[] array =new int  [a.length];
        
        if( str.equals("right") ) {
            
            for ( int i = 0 ; i < k ; i++ ) {
                
                array [i] = a[ a.length-k+i ];
                
            }
            
            for (int i = 0 ; i < a.length-k ; i++ ) {
                
                array [k+i] = a[i];
                
            }
            
        }else if( s.equals("left") ) {
            
            for( int i = 0 ; i < a.length-k ; i++ ) {
                
                array[i] = a[k+i];
                
            }
            
            for ( int i = 0 ; i < k ; i++ ) {
                
                array[a.length-k+i] = a[i];
                
            }
            
        }
        
        return array;
        
    }
    
}
