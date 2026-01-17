import java.util.Scanner;

/*
GROUP 7: Digit Extraction Problems
Same loop, different counters
Questions:
(23) Count digits
(24) Sum of digits
(25) Product of digits
(26) Reverse number
(27) Palindrome
(31) Largest digit
(32) Smallest digit
(33–35) Even/odd digit logic
*/


public class loopBasedLogicF {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int originalNum = num;

        int count = 0;
        int sum = 0;
        int product = 1;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int reversedNum = 0;
        int evenCount = 0;
        int oddCount = 0;

        while(num > 0){
            int digit = num % 10;

            // Count digits
            count++;

            // Sum of digits
            sum += digit;

            // Product of digits
            product *= digit;

            // Largest digit
            if(digit > largest){
                largest = digit;
            }

            // Smallest digit
            if(digit < smallest){
                smallest = digit;
            }

            // Reverse number
            reversedNum = reversedNum * 10 + digit;

            // Even/odd digit logic
            if(digit % 2 == 0){
                evenCount++;
            } else {
                oddCount++;
            }

            num /= 10;
        }

        System.out.println("Count of digits: " + count);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Product of digits: " + product);
        System.out.println("Largest digit: " + largest);
        System.out.println("Smallest digit: " + smallest);
        System.out.println("Reversed number: " + reversedNum);
        System.out.println("Even digits count: " + evenCount);
        System.out.println("Odd digits count: " + oddCount);

        // Check for palindrome
        if(originalNum == reversedNum){
            System.out.println(originalNum + " is a Palindrome");
        } else {
            System.out.println(originalNum + " is not a Palindrome");
        }

        sc.close();
    }

    
}
