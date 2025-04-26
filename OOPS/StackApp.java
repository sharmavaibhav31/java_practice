import java.util.Scanner;

interface Stack {
    int MAX = 10;
    int[] Stacks = new int[MAX];

    void push();

    void pop();

    void display();
}

class StackOp implements Stack {
    int top = 0;
    Scanner sc = new Scanner(System.in);

    public void push() {
        if (top == MAX) {
            System.out.println("Stack Overflow");
        } else {
            System.out.print("Enter the element to be pushed: ");
            int elem = sc.nextInt();
            Stacks[top++] = elem;
            System.out.println("Element " + elem + " pushed.");
        }
    }

    public void pop() {
        if (top == 0) {
            System.err.println("Stack Underflow");
        } else {
            int elementPop = Stacks[--top];
            System.out.println("Element " + elementPop + " popped.");
        }
    }

    public void display() {
        if (top == 0) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("The current stack is: ");
            for (int i = 0; i < top; i++) {
                System.out.println(Stacks[i]);
            }
        }
    }
}

public class StackApp {
    public static void main(String[] args) {
        StackOp stackOp = new StackOp();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Stack Operations ---");
            System.out.println("1. Push an element");
            System.out.println("2. Pop an element");
            System.out.println("3. Display the stack");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    stackOp.push(); // Call push method
                    break;
                case 2:
                    stackOp.pop(); // Call pop method
                    break;
                case 3:
                    stackOp.display(); // Call display method
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    sc.close();
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice! Please choose again.");
            }
        }
    }
}
