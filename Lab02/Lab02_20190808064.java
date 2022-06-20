import java.util.Scanner;

public class Lab02_20190808064 {
    public static void main(String[] args) {
        // Name : Ali Çolak      Date:27.10.2020
        Scanner gir=new Scanner(System.in);
        System.out.print("a:");
        double a=gir.nextDouble();
        System.out.print("b:");
        double b=gir.nextDouble();
        System.out.print("c:");
        double c=gir.nextDouble();
        double delta=(b*b)-(4*a*c);
        if(delta>0){
            double root1=(-b-Math.sqrt(delta))/(2*a);
            double root2=(-b+Math.sqrt(delta))/(2*a);
            System.out.println("Because of delta more than zero ,There is two root.");
            System.out.println("Root 1 : "+ root1 );
            System.out.println("Root 2 : "+ root2 ); 
        }
        else if (delta==0){
            double root=(-b-Math.sqrt(delta))/(2*a);
            System.out.println("Because of delta equal to zero ,There is one root.");
            System.out.println("Root : "+root);
        }
        else {
            System.out.println("Because of delta less than zero ,There is no real root.");
        }
    }
}
