// 1) Write a Program to Check Whether Number is Even or Odd

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOddUseBufferReader {
    public static void main(String[] args) throws IOException {
        
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the NUmber :");
        int n =Integer.parseInt(Br.readLine());

        if (n%2==0) 
        {
            System.out.println("NUmber is Even");
        } else 
        {
            System.out.println("Number is Odd");
        }
    }
    
}
