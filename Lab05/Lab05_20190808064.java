/*
 * @author Ali Çolak
 * 24.11.2020
 */

public class Lab05_20190808064 {
    public static void main(String[] args) {
        int n=26;
        for (int i=0;i<n+1;i++){
            for(int j=0;j<i;j++){
                System.out.print((char)(i+64));
            }
            System.out.println();
        }
    }
}
