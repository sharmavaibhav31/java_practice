package training_2026;

import java.util.*;

public class practiceSet2 {

    // 21. Program to check given number is palindromic prime or not.
    // Ex: 11, 101, 131, 151, 181, 191,313…. Are palindromic primes.
    public static boolean isPalindromicPrime(int num){
        return isPrime(num) && isPalindrome(num);
    }
    static boolean isPrime(int num){
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    static boolean isPalindrome(int num){
        int originalNum = num;
        int reversedNum = 0;
        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return originalNum == reversedNum;
    }
    
    // 22. Program to print palindromes in the user given range
    public static void printPalindromesInRange(int start, int end){
        System.out.print("Palindromic numbers between " + start + " and " + end + ": ");
        for (int i = start; i <= end; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // 23. Program to print palindromic primes in the user given range
    public static void printPalindromicPrimesInRange(int start, int end){
        System.out.print("Palindromic prime numbers between " + start + " and " + end + ": ");
        for (int i = start; i <= end; i++) {
            if (isPalindromicPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    // 24. Program to check given number is Armstrong number or not.
    public static boolean isArmstrong(int num){
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length();
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        return originalNum == sum;
    }
    // 25. Program to print Armstrong numbers in the user given range.
    public static void printArmstrongNumbersInRange(int start, int end){
        System.out.print("Armstrong numbers between " + start + " and " + end + ": ");
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    // 26. Program to count Armstrong numbers in the user given range.
    public static int countArmstrongNumbersInRange(int start, int end){
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                count++;
            }
        }
        return count;
    }
    
    // 27. Program to print primes in the array.
    // 28. Program to find sum of primes in the array
    // 29. Program to count of primes in the array
    // 30. Program to find sum of evens in the array
    // 31. Program to find smallest prime in the array
    // 32. Program to find largest even in the array
    // 33. Program to find smallest odd in the array
    // 34. Program to find kth smallest even number in the array
    // 35. Program to find kth largest prime in the array
    // 36. Program to check if the array contains all primes between smallest and
    // largest primes of the array.
    // Ex: Input: a=[25,11, 12,7,19,45,13,60,17,80]
    // Output: True
    // Explanation: smallest prime: 7
    // Largest prime: 19
    // Array has all primes between 7 to 19, hence the output : True.
    // 37. Program to find union of two arrays.
    // 38. Program to find intersection of two arrays
    // 39. Program to find the difference of two sets.
    // 40. Program to find and count duplicate elements from the array
}