import java.util.Scanner;

public class conditionalLogicA {
    public static void main(String[] args) {
        /*
        GROUP 1: Sign, Range, Eligibility Checks
        Same idea: compare against constants
        Questions:  
        (2) Positive / Negative / Zero
        (9) Number lies in range    
        (15) Voting eligibility
        (20) Number in inclusive range 
        */
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        // Check if the number is positive, negative, or zero
        if (num > 0) {
            System.out.println(num + " is a positive number.");
        } else if (num < 0) {
            System.out.println(num + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }

        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        // Check voting eligibility
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        System.out.println("Enter a number to check range (10-50): ");
        int rangedNum = sc.nextInt();
        // Check if the number lies in the range 10 to 50
        if (rangedNum >= 10 && rangedNum <= 50) {
            System.out.println(rangedNum + " lies in the range 10 to 50.");
        } else {
            System.out.println(rangedNum + " does not lie in the range 10 to 50.");
        }

        System.out.println("Enter the number to check inclusive range (-5 to 5): ");
        int inclusiveNum = sc.nextInt();
        // Check if the number is in the inclusive range -5 to 5
        if (inclusiveNum >= -5 && inclusiveNum <= 5) {
            System.out.println(inclusiveNum + " is in the inclusive range -5 to 5.");
        } else {
            System.out.println(inclusiveNum + " is not in the inclusive range -5 to 5.");
        }

        System.out.println("Enter the number to check if it's a multiple of 5: ");
        int number = sc.nextInt();
        // Check if the number is a multiple of 5
        //modify the number in if condition to check other eligibility
        if (number % 5 == 0) {
            System.out.println(number + " is a multiple of 5.");
        } else {
            System.out.println(number + " is not a multiple of 5.");
        }
    }
}