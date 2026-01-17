import java.util.Scanner;
/*
Sequence generation
Questions:
(28) Factorial
(29) Fibonacci series
(30) nth Fibonacci
*/

public class loopBasedLogicG {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Factorial of n
        System.out.println("Enter the number for factorial: ");
        int num = sc.nextInt();
        int fact = 1;
        for(int i = num; i > 0; i--){
            fact *= i;
        }
        System.out.println("The Factorial is " + fact );

        // Fibonacci Series
        System.out.println("Enter the number for Fibonacci Series: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println("Fibonacci Series: ");
        for(int i = 0;  i <= n; i++){
            System.out.println(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        

    }
}
