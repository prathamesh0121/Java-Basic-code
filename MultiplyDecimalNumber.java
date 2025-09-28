//  Write a Program to Multiply two decimal Numbers entered by User

import java.util.Scanner;

public class MultiplyDecimalNumber {
    public static void main(String[] args) {
        
        Scanner scanner =new Scanner(System.in);

        System.out.println("Frist number is :");
        float num1 =scanner.nextFloat();
        

        System.out.println("Second number is :");
        float num2 =scanner.nextFloat();

        System.out.println("MUltiply Two Decimal Numbers :"+num1 *num2);

    }
    
}
