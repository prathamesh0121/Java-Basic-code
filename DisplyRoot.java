 // 4) Write a Program which accepts coefficients of a quadratic equation from the user and displays the roots both real and complex roots depending upon the discriminant).

import java.util.Scanner;

public class DisplyRoot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the a :");
        double a =scanner.nextInt();
        System.out.println("Enter the b :");
        double b= scanner.nextInt();
        System.out.println("Enter the c :");
        double c =scanner.nextInt();

        double d =b*b-4*a*c;

        if (d>0) 
        {
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Root are real and Distinct");
            System.out.println(root1+"\n"+root2);
        } 
        else if(d==0)
        {
            double root3=-b/(2*a);
            System.out.println("Root are real and equal");
            System.out.println(root3);
        }
        else
        {
            double  realpart = (-b) /(2*a);
            double imagnarypart =Math.sqrt(-d) / (2*a);

            System.out.println("root are complex");
            System.out.println("root1"+realpart+"+"+imagnarypart+"i");
            System.out.println("root2"+realpart+"+"+imagnarypart+"i");

        }
        scanner.close();
    }    
}
