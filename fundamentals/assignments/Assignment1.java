package fundamentals.assignments;

public class Assignment1{
    

    public static void main(String[] args) {

    /*Question 1:
    Write a Java program that demonstrates the use of variables and data types. 
    The program should use variables of different data types (int, double, char, boolean, String) and 
    perform basic operations such as addition, subtraction, multiplication, and string concatenation.
    Clarifications:
    1. Declare variables of different data types (e.g., int, double, char, boolean, String).
    2. Perform basic arithmetic operations using numeric data types (int and double).
    3. Concatenate strings using the String variable and display the result.
    4. Display the results of all operations.
    */
        int num1 = 10;
        int num2 = 5;
        double decimal1 = 3.14;
        double decimal2 = 2.71;
        char letter = 'A';
        boolean isJavaFun = true;
        String greeting = "Hello, World!";

        // Basic arithmetic operations
        int sum = num1 + num2; 
        int difference = num1 - num2; 
        int product = num1 * num2; 
        double quotient = decimal1 / decimal2; 

        // Concatenate strings
        String fullGreeting = greeting + " Welcome to Java programming.";

        // Display the results of all operations
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Letter: " + letter);
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println(fullGreeting);

        /*Question 2:
    Write a Java program that creates an array of integers and performs the following operations: - Assign values to the array
    - Find the sum and average of the array elements
    - Find the largest and smallest element in the array
    Clarifications:
    1. Create an array of integers.
    2. Assign values to the array using a loop or direct initialization.
    3. Calculate the sum and average of the array elements.
    4. Find and display the largest and smallest elements in the array.
    Expected Output:
    Array elements: 10, 20, 30, 40, 50
    Sum of array elements: 150
    Average of array elements: 30
    Largest element: 50
    Smallest element: 10
    */

    int[] numbers = {10, 20, 30, 40, 50};
    int sumArray = 0;
    double average = 0.0;
    int largest = numbers[0];
    int smallest = numbers[0];

    for(int i = 0; i < numbers.length; i++){
        sumArray += numbers[i];
        average = (double) sumArray/numbers.length;
        if(numbers[i] > largest){
            largest = numbers[i];
        }

        if(numbers[i] < smallest){
            smallest = numbers[i];
        }
    }

    System.out.println("Array elements: ");
    for(int i = 0; i < numbers.length; i++){
        System.out.print(numbers[i] + " "); 
    }
    System.out.println("Sum of array elements: " + sumArray);
    System.out.println("Average of array elements: " + average);
    System.out.println("Largest element: " + largest);
    System.out.println("Smallest element: " + smallest);    
    }
}
