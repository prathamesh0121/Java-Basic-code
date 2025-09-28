//  Write a Program to Print Integer Number Entered by User  and Write a Program to Add Two Integer Numbers Entered by User

import java.util.Scanner;

public class Arithematic_User_Input {
     public static void main(String[] args) {
        for (int a=1 ;a<=3 ;a++)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the Frist interger Number : ");
            int Num1 = scanner.nextInt();
            System.out.println("Frist Number is :"+Num1);


            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Enter the Second integer Number :");
            int Num2 = scanner2.nextInt();
            System.out.println("Second Number is :"+Num2);


            int addition =Num1 +Num2;
            System.out.println("Addition is :"+addition);

            int substraction =Num1 - Num2;
            System.out.println("Substraction is:"+substraction);

            int mul =Num1 * Num2;
            System.out.println("Multiplication is:"+mul);

            int div =Num1 / Num2;
            System.out.println("Division is:"+div);
        }


    }
}