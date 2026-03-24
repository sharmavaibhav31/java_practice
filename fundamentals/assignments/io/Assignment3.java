package fundamentals.assignments.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/*Question 1:
Write a Java program that demonstrates user input and file handling. 
The program should prompt the user to enter their complete name (the student should enter his/her first and last name) and a text file name, 
append the complete name to the specified file content, read the file's content, and display it on the console.
Clarifications:
1. Use the Scanner class to read user input for the file name.
2. Append your complete name to the specified file, then read and display the file's content on the console.
3. Handle any possible errors, such as file not found or input mismatch exceptions.
*/

// class Assignment3 {
//     public static void main(String[] args) throws IOException {

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your complete name: ");
//         String name = sc.nextLine();
//         System.out.print("Enter the file name: ");
//         String fileName = sc.nextLine();

//         try (FileWriter writer = new FileWriter(fileName, true)) {
//             writer.write(name + "\n");
//         } catch (IOException e) {
//             System.out.println("An error occurred while writing to the file: " + e.getMessage());
//             return;
//         }
//         try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
//             String line;
//             System.out.println("File content:");
//             while ((line = reader.readLine()) != null) {
//                 System.out.println(line);
//             }
//         } catch (IOException e) {
//             System.out.println("An error occurred while reading the file: " + e.getMessage());
//         }
//     }
// }

/*
Question 2:
Write a Java program that demonstrates the use of exceptions for error handling. The program should handle a divide by zero exception and display an appropriate message.
Clarifications:
1. Implement try-catch blocks to handle exceptions.
2. Simulate a division by zero operation and catch the ArithmeticException.
3. Display 'Division by zero is not possible' if a division by zero occurs.
Expected Output:
Enter numerator: 10
Enter denominator: 0
Division by zero is not possible.*/
class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int numerator = sc.nextInt();
        System.out.print("Enter denominator: ");
        int denominator = sc.nextInt();

        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not possible.");
        }
    }
}







/*
Question 3:
Write a Java program that demonstrates BufferedReader for reading input from the user. The program should read a user's name and age, then display them in a message.
Clarifications:
1. Use BufferedReader to read user input for name and age.
2. Use the readLine() method to read strings and the parseInt() method to read integers.
3. Display the user's name and age in a formatted message. */
