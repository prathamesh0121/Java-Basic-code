// Write a Program to Check Whether a Character is Vowel or Consonant

import java.util.Scanner;

public class VowelConsonts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Character:");
        char n =scanner.next().charAt(0);

        if (n>='a' && n<='z' || n>='A' && n<='Z') 
        {
           if (n=='a' || n=='e'|| n=='i'|| n=='o' || n=='u'||
               n=='A' || n=='E'|| n=='I'|| n=='O' || n=='U')
            {
                System.out.println("Charachter is Vowel");
            }
            else 
            {
                System.out.println("Character is Consonants");
            }
            
        } 
        else 
        {
            System.out.println("You enter Wrong Value");
            
        }
        scanner.close();
    }
    
}
