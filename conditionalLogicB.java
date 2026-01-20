import java.util.Scanner;
/*
Questions:
(1) Even / Odd (without %)
(6) Divisible by 3 and 5
(12) Ends with 5 or 0
(13) Same last digit
(14) Multiple of another number
(16) Divisible by 4 but not by 8
*/

public class conditionalLogicB {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        
        int num = sc.nextInt();
        
        // Check if the number is even or odd without using %
        if( (num&1) ==0){
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }

        // Check if the number is divisible by 3 and 5
        if(num % 3 == 0 && num % 5 == 0){
            System.out.println(num + " is divisible by both 3 and 5.");
        } else {
            System.out.println(num + " is not divisible by both 3 and 5."); 
        }

        // Check if the number ends with 5 or 0
        if(num % 10 == 0 || num % 10 == 5){
            System.out.println(num + " ends with 5 or 0.");
        } else {
            System.out.println(num + " does not end with 5 or 0.");
        }

        //Check if two numbers have same last digit
        int num1, num2;
        System.out.println("Enter two numbers to check if they have the same last digit: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        if(num1 % 10 == num2 % 10){
            System.out.println(num1 + " and " + num2 + " have the same last digit.");
        } else {
            System.out.println(num1 + " and " + num2 + " do not have the same last digit.");
        }

        //check if a number is multiple of another number
        int a,b;
        System.out.println("Enter two numbers to check if the first is a multiple of the second: ");
        a = sc.nextInt();
        b = sc.nextInt();
        if(b != 0 && a % b == 0){
            System.out.println(a + " is a multiple of " + b + ".");
        } else {
            System.out.println(a + " is not a multiple of " + b + "."); 
        }

        // Check if the number is divisible by 4 but not by 8
        if(num % 4 == 0 && num % 8 != 0){
            System.out.println(num + " is divisible by 4 but not by 8.");
        } else {
            System.out.println(num + " is not divisible by 4 or is divisible by 8.");
        }

        sc.close();
    }
    
}

