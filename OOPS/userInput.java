import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.println("Enter values of a and b\n");
        a = input.nextInt();
        b = input.nextInt();
        int sum = a + b;
        System.out.println("The sum is:"+sum);
    }
    
}
