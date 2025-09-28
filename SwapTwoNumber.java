// Write a Program to Swap Two Numbers

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("Frist Number is :");
        int num1 =scanner.nextInt();
        

        System.out.println("Second Number is :");
        int num2 =scanner.nextInt();

        //Using Temporary Variable
        int temp = num1;
        
        num1 = num2;

        num2 =temp;

        System.out.println("Using Temporary Variable");

        System.out.println("\nSwap Frist Number is :"+num1);

        System.out.println("Swap Second Number is :"+num2);

        // Without Temporary Variable -Using Arithmetic

        num1 =num1 +num2;

        num2=num1 -num2;

        num1= num1-num2;

        System.out.println("\nWithout Temporary Variable  Using Arithmetic");

        System.out.println("\nSwap Frist Number is :"+num1);

        System.out.println("Swap Second Number is :"+num2);

    }
    
}
