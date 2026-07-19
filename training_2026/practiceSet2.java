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
    public static void printPrimesInArray(int[] arr){
        System.out.print("Prime numbers in the array: ");
        for (int num : arr) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
    // 28. Program to find sum of primes in the array
    public static int findSumOfPrimesInArray(int[] arr){
        int sum = 0;
        for (int num : arr) {
            if (isPrime(num)) {
                sum += num;
            }
        }
        return sum;
    }
    // 29. Program to count of primes in the array
    public static int countPrimesInArray(int[] arr){
        int count = 0;
        for (int num : arr) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }

    // 30. Program to find sum of evens in the array
    public static int findSumOfEvensInArray(int[] arr){
        int sum = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }
    // 31. Program to find smallest prime in the array
    public static int findSmallestPrimeInArray(int[] arr){
        int smallestPrime = Integer.MAX_VALUE;
        for (int num : arr) {
            if (isPrime(num) && num < smallestPrime) {
                smallestPrime = num;
            }
        }
        return smallestPrime == Integer.MAX_VALUE ? -1 : smallestPrime; // Return -1 if no prime found
    }
    // 32. Program to find largest even in the array
    public static int findLargestEvenInArray(int[] arr){
        int largestEven = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num % 2 == 0 && num > largestEven) {
                largestEven = num;
            }
        }
        return largestEven == Integer.MIN_VALUE ? -1 : largestEven; // Return -1 if no even number found
    }
    // 33. Program to find smallest odd in the array
    public static int findSmallestOddInArray(int[] arr){
        int smallestOdd = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num % 2 != 0 && num < smallestOdd) {
                smallestOdd = num;
            }
        }
        return smallestOdd == Integer.MAX_VALUE ? -1 : smallestOdd; // Return -1 if no odd number found
    }
    // 34. Program to find kth smallest even number in the array
    public static int findKthSmallestEvenInArray(int[] arr, int k){
        List<Integer> evens = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 == 0) {
                evens.add(num);
            }
        }
        Collections.sort(evens);
        return (k > 0 && k <= evens.size()) ? evens.get(k - 1) : -1; // Return -1 if k is out of bounds
    }

    // 35. Program to find kth largest prime in the array
    public static int findKthLargestPrimeInArray(int[] arr, int k){
        List<Integer> primes = new ArrayList<>();
        for (int num : arr) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }
        Collections.sort(primes, Collections.reverseOrder());
        return (k > 0 && k <= primes.size()) ? primes.get(k - 1) : -1; // Return -1 if k is out of bounds
    }

    // 36. Program to check if the array contains all primes between smallest and largest primes of the array.
    // Ex: Input: a=[25,11, 12,7,19,45,13,60,17,80]
    // Output: True
    // Explanation: smallest prime: 7
    // Largest prime: 19
    // Array has all primes between 7 to 19, hence the output : True.
    public static boolean containsAllPrimesInRange(int[] arr){
        int smallestPrime = Integer.MAX_VALUE;
        int largestPrime = Integer.MIN_VALUE;
        Set<Integer> primeSet = new HashSet<>();
        
        for (int num : arr) {
            if (isPrime(num)) {
                primeSet.add(num);
                if (num < smallestPrime) smallestPrime = num;
                if (num > largestPrime) largestPrime = num;
            }
        }
        
        for (int i = smallestPrime; i <= largestPrime; i++) {
            if (isPrime(i) && !primeSet.contains(i)) {
                return false; // Missing a prime in the range
            }
        }
        return true; // All primes in the range are present
    }
    // 37. Program to find union of two arrays.
    // 38. Program to find intersection of two arrays
    // 39. Program to find the difference of two sets.
    // 40. Program to find and count duplicate elements from the array
}