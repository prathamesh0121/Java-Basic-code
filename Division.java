// Write a program where the user is asked to enter two integers (divisor and dividend) and the quotient and the remainder of their division is computed.(Both divisor and dividend should be integers.)

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        
        Scanner scanner =new Scanner(System.in);

        System.out.println("Dividend is :");
        int num1 =scanner.nextInt();
        

        System.out.println("Divisor is :");
        int num2 =scanner.nextInt();

        int quotient = num1/ num2;

        int reminder =num1 % num2;

        System.out.println("Quitient is :"+quotient);
        System.out.println("Reminder is :"+reminder);

        // System.out.println("Quotient: " + (num1/num2) + "\nRemainder: " + (num1%num2));   (OPtional)
    }
    
}
