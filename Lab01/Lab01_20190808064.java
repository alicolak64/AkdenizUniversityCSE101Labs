import java.util.Scanner;

public class Lab01_20190808064 {
    public static void main(String[] args) {
        System.out.println("Welcome to the application that calculates area and perimeter with the length of two edges you entered");
        System.out.println("Please enter length of the first edge ");
        Scanner gir =new Scanner(System.in);
        double a= gir.nextDouble();
        System.out.println("Please enter length of the second edge");
        double b= gir.nextInt();
        double area=a*b;
        double perimeter =2*(a+b);
        System.out.println("Area : "+area);
        System.out.println("Perimiter : "+perimeter);
    }
}
