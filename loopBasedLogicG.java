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

        System.out.println("Enter the number for factorial: ");

        int num = sc.nextInt();
        int fact = 1;
        for(int i = num; i > 0; i--){
            fact *= i;
        }
        System.out.println("The Factorial is " + fact );

    }
}
