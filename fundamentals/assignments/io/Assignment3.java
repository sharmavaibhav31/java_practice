package fundamentals.assignments.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
/*Question 1:
Write a Java program that demonstrates user input and file handling. 
The program should prompt the user to enter their complete name (the student should enter his/her first and last name) and a text file name, 
append the complete name to the specified file content, read the file's content, and display it on the console.
Clarifications:
1. Use the Scanner class to read user input for the file name.
2. Append your complete name to the specified file, then read and display the file's content on the console.
3. Handle any possible errors, such as file not found or input mismatch exceptions.

Question 2:
Write a Java program that demonstrates the use of exceptions for error handling. The program should handle a divide by zero exception and display an appropriate message.
Clarifications:
1. Implement try-catch blocks to handle exceptions.
2. Simulate a division by zero operation and catch the ArithmeticException.
3. Display 'Division by zero is not possible' if a division by zero occurs.
Expected Output:
Enter numerator: 10
Enter denominator: 0
Division by zero is not possible.

Question 3:
Write a Java program that demonstrates BufferedReader for reading input from the user. The program should read a user's name and age, then display them in a message.
Clarifications:
1. Use BufferedReader to read user input for name and age.
2. Use the readLine() method to read strings and the parseInt() method to read integers.
3. Display the user's name and age in a formatted message. 

Question 4:
Write a Java program that demonstrates the use of ArrayLists, LinkedLists, and HashSet from the Collections Framework. 
The program should add elements to each of these collections and display them.
Clarifications:
1. Create an ArrayList and add a few elements. Display the ArrayList.
2. Create a LinkedList, add elements, and display the LinkedList.
3. Create a HashSet, add elements, and display the HashSet.
4. Explain the differences between ArrayList, LinkedList, and HashSet.
*/

class Assignment3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your complete name: ");
        String name = sc.nextLine();
        System.out.print("Enter the file name: ");
        String fileName = sc.nextLine();

        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(name + "\n");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
            return;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("File content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

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
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");
        name = reader.readLine();
        System.out.print("Enter your age: ");
        int age = Integer.parseInt(reader.readLine());
        System.out.println("Your name is \'" + name + "\' and you are " + age + " years old.");

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("ArrayList: " + arrayList);

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Rabbit");
        System.out.println("LinkedList: " + linkedList);

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Blue");
        System.out.println("HashSet: " + hashSet);

        System.out.println("\nDifferences:");
        System.out.println("1. ArrayList is a resizable array implementation, while LinkedList is a doubly-linked list implementation.");
        System.out.println("2. ArrayList allows fast random access to elements, while LinkedList allows for efficient insertion and deletion.");
        System.out.println("3. HashSet is a collection that does not allow duplicate elements and does not maintain any order, while ArrayList and LinkedList allow duplicates and maintain the order of insertion.");
    }
    }
}
