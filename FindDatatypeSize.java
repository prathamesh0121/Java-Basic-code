// ) Write a Program to Find Size of int, float, double and char in your computer

public class FindDatatypeSize {
    public static void main(String[] args) {
        
        //using .SIZE/8
        System.out.println("Interger size is :"+Integer.SIZE/8);

        System.out.println("Float size is :"+Float.SIZE/8);

        System.out.println("Double size is :"+Double.SIZE/8);

        System.out.println("Char size is :"+Character.SIZE/8);

        System.out.println("Long size is :"+Long.SIZE/8);

        System.out.println("Short size is :"+Short.SIZE/8);

        System.out.println("Byte size is :"+Byte.SIZE/8);

        System.out.println("-----------------------------------OR------------------------------------------");

        //Using BYTES 
        System.out.println("Interger size is :"+Integer.BYTES);
        
        System.out.println("Float size is :"+Float.BYTES);

        System.out.println("Double size is :"+Double.BYTES);

        System.out.println("Char size is :"+Character.BYTES);

        System.out.println("Long size is :"+Long.BYTES);

        System.out.println("Short size is :"+Short.BYTES);

        System.out.println("Byte size is :"+Byte.BYTES);

    }
    
}
