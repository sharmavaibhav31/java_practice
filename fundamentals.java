import java.util.Scanner;

public class fundamentals {
    public static void main(String[] args){

        /*
        i. Read an integer and print it.
        ii. Read two integers and print their sum.
        iii. Read two integers and print their difference.
        iv. Read two integers and print their product.
        v. Read two integers and print quotient and remainder.
        vi. Read a character and print its ASCII value.
        vii. Read an ASCII value and print the character.
        viii. Read a float and print it with 2 decimal places.
        ix. Read a string and print it.
        x. Read three numbers and print their average. 
        */

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        float f = sc.nextFloat();
        double c = sc.nextDouble();
        char d = sc.next().charAt(0);
        String e = sc.next();

        System.out.println("Sum of a and b is: "  + (a + b));
        System.out.println("Difference of a and b is: "  + (a - b));
        System.out.println("Product of a and b is: "  + (a * b));
        System.out.println("Quotient of a and b is: "  + (a / b));
        System.out.println("Remainder of a and b is: "  + (a % b));
        System.out.println("ASCII value of " + d + " is: " + (int)d);
        System.out.println("Character for ASCII value " + (int)d + " is: " + d);
        System.out.printf("Float value with 2 decimal places: %.2f\n", b);
        System.out.println("String entered is: " + e);


        System.out.println("hELLO WORLD");


    }
    
}
