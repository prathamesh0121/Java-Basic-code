// 1) Write a Program to Check Whether Number is Even or Odd

import java.util.Scanner;

public class EvenOdd 
{
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the Number :");
        int n =scanner.nextInt();

        if (n % 2 == 0) 
        {
            System.out.println("NUmber is Even");
            
        } else
        {
            System.out.println("NUmber is Odd");
        }
        scanner.close();
    }
    
}
