import java.util.Scanner;

public class Lab03_20190808064 {
    public static void main(String[] args) {
        System.out.println("Welcome to the app that calculate area of " +
                "triangle");
        Scanner gir=new Scanner(System.in);
        System.out.print("1. edge : ");
        double edge1= gir.nextDouble();
        System.out.print("2. edge : ");
        double edge2= gir.nextDouble();
        System.out.print("3. edge : ");
        double edge3= gir.nextDouble();
        if(edge1<=0 || edge2<=0 || edge3<=0)
            System.out.println("ERROR");
        else{
            if(edge1>=edge2+edge3 || edge2>=edge1+edge3 || edge3>=edge2+edge1)
                System.out.println("ERROR");
            else {
                double halftotal=(edge1+edge2+edge3)/2;
                double area=Math.sqrt(halftotal*(halftotal-edge1)*
                        (halftotal-edge2)*(halftotal-edge3));
                System.out.println("Area : "+area);
            }
        }
    }
}