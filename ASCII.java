// Write a Program to Find ASCII Value of a Character

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
    
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter Char Value :");
       char ch =scanner.next().charAt(0);   // take char input from user

       int Ascii =(int) ch;                      // Cast the char value using int and stoared in Ascii variable
        
       System.out.println("ASCII value of Ch :"+Ascii);
    }
    
}
