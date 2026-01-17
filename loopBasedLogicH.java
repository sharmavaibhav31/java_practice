import java.util.Scanner;

/*
Divisibility logic
Questions:
(37) Factors
(38) Count factors
(39) Prime
(40–41) Primes till N
(42) GCD
(43) LCM
*/

public class loopBasedLogicH {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // Factors of a number and count the factors
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        System.out.println("Factors of " + n + " are: ");
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count++;
                System.out.println(i + " ");
            }
        }
        System.out.println("Number of factors of " + n + " is: " + count);
        
        // Check if the number is prime

        if(count == 2){
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }

        // Sum of prime numbers till N
        System.out.print("Enter a number N to find sum of primes till N: ");
        int N = sc.nextInt();
        int sumOfPrimes = 0;
        for(int i = 2; i <= N; i++){
            int primeCount = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    primeCount++;
                }
            }
            if(primeCount == 2){
                sumOfPrimes += i;
            }
        }
        System.out.println("Sum of prime numbers till " + N + " is: " + sumOfPrimes);

        // GCD and LCM of two numbers
        System.out.print("Enter two numbers to find GCD and LCM: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = 1;
        for(int i = 1; i <= Math.min(a, b); i++){
            if(a % i == 0 && b % i == 0){
                gcd = i;
            }
        }   
        int lcm = (a * b) / gcd;
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);

        sc.close();

    }
}
