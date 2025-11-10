// Write a Program to Check Whether a Character is Vowel or Consonant

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class VowelConsontsUseHashset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Character:");
        char n = scanner.next().charAt(0);

        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));

        if (vowels.contains(n)) 
        {
            System.out.println("Character is Vowels");
        }
        else if (Character.isLetter(n)) {
            System.out.println("Character is Consonants");
        }
        else
        {
            System.out.println("Enter the Valid character");
        }
        scanner.close();
    }

}
