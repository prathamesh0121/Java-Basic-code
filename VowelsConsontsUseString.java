// Write a Program to Check Whether a Character is Vowel or Consonant

import java.util.Scanner;

public class VowelsConsontsUseString {
    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Charatcter :");
        char n =scanner.next().charAt(0);

        String str ="aeiouAEIOU";

        if (str.contains(Character.toString(n))) 
        {
            System.out.println("Charachter is Vowels");
        } 
        else if (n>='a' && n<='z' || n>='A' && n<='Z') 
        {
            System.out.println("Character is consonants");
        } else 
        {
            System.out.println("Enter the Valid character");
        }
        scanner.close();
    }
}
