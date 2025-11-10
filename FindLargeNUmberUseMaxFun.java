import java.util.Scanner;

public class FindLargeNUmberUseMaxFun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the frist number :");
        int a =scanner.nextInt();
        System.out.println("Enter the Second  number :");
        int b= scanner.nextInt();
        System.out.println("Enter the Third number :");
        int c =scanner.nextInt();
        System.out.println("Enter the Third number :");
        int d =scanner.nextInt();


        int Largest =Math.max(a, Math.max(b, Math.max(c, d)));

        int smallest =Math.min(a, Math.min(b, Math.min(c, d)));

        System.out.println("Largest Number is:"+Largest);

        System.out.println("Smallest Number is:"+smallest);
        scanner.close();
    }
    
}
