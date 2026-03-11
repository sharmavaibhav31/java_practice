package fundamentals.assignments;
import fundamentals.assignments.Student;

/*Java Programming Assignment 2
Question 1:
Write a Java program to demonstrate the usage of return types and arguments. Create a method that takes two integers as arguments and returns their sum. 
Then, call this method from the main method and display the result.
Clarifications:
1. Define a method that takes two integer arguments and returns their sum.
2. In the main method, call the method with appropriate arguments and display the returned result.
3. Ensure the correct return type and arguments are used for the method.
Expected Output:
Sum of 5 and 10: 15

Question 2:
Explain the concept of 'public static void main' in Java. Write a program that demonstrates the execution of a simple 'public static void main' method, and explain its components: 
'public', 'static', 'void', and 'main'.
Clarifications:
1. Define the 'public static void main' method in your program.
2. Explain the purpose of 'public', 'static', 'void', and 'main' in the method declaration.
3. Implement a simple program that outputs 'Hello, World!' using the main method.


Question 3:
Write a Java program to demonstrate the concepts of classes, objects, and constructors. Create a class 'Student' with attributes like 'name', 'age', and 'grade'. 
Use a constructor to initialize these attributes, and then create an object of the class in the main method to display the student's information.
Clarifications:
1. Create a 'Student' class with attributes 'name', 'age', and 'grade'.
2. Define a constructor to initialize the attributes.
3. In the main method, create an object of the 'Student' class and display its information.
Expected Output:
Student Information:
Name: John Doe
Age: 20
Grade: A
*/


public class Assignment2 {
    public static void main(String[] args) {
        Student student = new Student("Rishik", 20, "A");
        System.out.println("Student Information:");
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
        System.out.println("Grade: " + student.grade);
    }    
}








/*


    public int sum(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        Assignment2 assignment = new Assignment2();
        int result = assignment.sum(5, 10);
        System.out.println("Sum of 5 and 10: " + result);
    }

    public demonstratePSVM() {
        System.out.println("Hello, World!");
        System.out.println("Explanation of 'public static void main':");
        System.out.println("'public': The method is accessible from anywhere in the program. Public is a keyword for access modifier that allows the method to be called from outside the class.");
        System.out.println("'static': The static keyword indicates that the method belongs to the class and can be called without creating an instance of the class.");
        System.out.println("'void': The void keyword indicates that the method does not return any value. In the place of void, other return types can be used to specify the return type of the method");
        System.out.println("'main': The main method is the entry point of a Java program.");
    }


Question 4:
Write a Java program to demonstrate inheritance, interfaces, and method overriding. Create a superclass 'Animal' with a method 'sound'. Then, create a subclass 'Dog' that overrides the 'sound' method. Use an interface 'Playable' that defines a 'play' method, and have 'Dog' implement the 'Playable' interface.
Clarifications:
1. Create an 'Animal' class with a method 'sound'.
2. Create a 'Dog' class that inherits from 'Animal' and overrides the 'sound' method.
3. Define an interface 'Playable' with a 'play' method, and implement it in the 'Dog' class.
4. Demonstrate the use of inheritance and method overriding in the main method.
Expected Output:
Dog makes a sound: Woof
Dog can play: Yes*/

