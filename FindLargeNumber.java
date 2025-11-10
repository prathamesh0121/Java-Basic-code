// Write a Program to Find Largest Number Among Three Numbers entered by users
import java.util.Scanner;

public class FindLargeNumber {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the frist number :");
        int a =scanner.nextInt();
        System.out.println("Enter the Second  number :");
        int b= scanner.nextInt();
        System.out.println("Enter the Third number :");
        int c =scanner.nextInt();

        if (a>b && a>c) 
        {
            System.out.println("a is greater");
        } 
        else if (b>a && b>c) 
        {
            System.out.println("b is greater");
            
        }else if (c>a && c>b) 
        {
            System.out.println("c is greater");
        }
        scanner.close();
    }
    
}
