package training_2026;


// 17. Program to print primes in the user given range
// 18. Program to count primes in the user given range
// 19. Program to check the difference of max prime and min prime in the user given range
// 20. Program to check given number is palindrome or not
public class practiceSet1 {

    // 1. Program to swap two numbers without using third variable
    public static void swapNumbers(int a, int b){
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    // 2. Program to check given number is Power of 2 or not.
    // Trick: A power of 2 in binary looks like 1000... and (num - 1) looks like 0111...
    // Bitwise AND (&) between them will always equal 0.
    public static boolean isPowerOf2(int num){
    //     if (num <= 0) return false;
    //     return (num & (num - 1)) == 0;
    if (num <= 0) return false;
    
    while (num % 2 == 0) {
        num = num / 2;
    }
    return num == 1;
    }

    // 3. Program to check given char is vowel or not
    public static boolean isVowel(char input){
        char lower = Character.toLowerCase(input);
        return lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u';
    }

    // 4. Program to find area of triangle
    public static float areaTriangle(int height, int base){
        float area = 0.5f * base * height;
        return area;
    }

    // 5. Program to perform division of two numbers
    public static float division(int a, int b){
        float result = 0;
        if(b != 0){
            result = (float) a / b; 
        }
        return result;
    }

    // 6. Program to print a random number.
    public static void printRandomNumber(int min, int max){
        int randomNum = (int)(Math.random() * (max - min + 1) + min);
        System.out.println("Random number between " + min + " and " + max + ": " + randomNum);
    }

    // 7. Program to find the largest in the two given numbers
    public static int largestOfTwo(int a, int b){
        return (a > b) ? a : b;
    }

    // 8. Program to check given number is even or odd 
    public static void isEvenOrOdd(int num){
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }

    // 9. Program to check given number is even or odd without using if else control statement
    public static void isEvenOrOddWithoutIfElse(int num){
        // String[] outputs = {"Even", "Odd"};
        // // Math.abs handles negative numbers, ensuring the remainder is 0 or 1
        // System.out.println(num + " is " + outputs[Math.abs(num % 2)]);
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is " + result);
    }

    // 10. Program to check given number is even or odd without using % operator.
    public static void isEvenOrOddWithoutModulus(int num){
        if ((num & 1) == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }

    // 11. Program to find smallest number from the given 3 numbers
    public static int smallestOfThreeNumbers(int num1, int num2, int num3){
        return (num1 < num2) ? ((num1 < num3) ? num1 : num3) : ((num2 < num3) ? num2 : num3);
    }

    // 12. Program to find smallest odd number from the array
    public static int smallestOddNumber(int[] arr){
        int smallestOdd = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num % 2 != 0 && num < smallestOdd) {
                smallestOdd = num;
            }
        }
        return (smallestOdd == Integer.MAX_VALUE) ? -1 : smallestOdd; // Return -1 if no odd number found
    }

    // 13. Program to find sum of even numbers in user given range
    public static int sumOfEvenNumbersInRange(int start, int end){
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // 14. Program to print a random number in the user given range
    public static void printRandomNumberInRange(int min, int max){
        int randomNum = (int)(Math.random() * (max - min + 1) + min);
        System.out.println("Random number between " + min + " and " + max + ": " + randomNum);
    }

    // 15. Program to find sum of prime digits in a given number.
    public static int sumOfPrimeDigits(int num){
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            if (isPrime(digit)) {
                sum += digit;
            }
            num /= 10;
        }
        return sum;
    }

    // 16. Program to check given number is prime or not
    public static boolean isPrime(int num){
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }






}
