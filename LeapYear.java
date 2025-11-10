// 5) Write a Program to Check whether a year entered by user is Leap Year or not

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year :");
        int year =scanner.nextInt();


        if (year%400==0) 
        {
            System.out.println("this is a leap year");   
        } 
        else if(year%100==0)
        {
            System.out.println("This is not a leap year");            
        }
        else if (year%4==0) 
        {
            System.out.println("This is a leap year");    
        }
        else
        {
            System.out.println("this is general year");
        }
    }
}
