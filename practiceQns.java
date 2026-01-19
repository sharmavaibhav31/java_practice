import java.util.Scanner;

public class practiceQns {


    //1.  Reverse an array in-place with O(1) space complexity
    public static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reversed array is: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    //2.  Find the duplicate elements in an array
    public static void findDuplicates(int[] arr){
        System.out.println("Duplicate elements are: ");
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }

    //3.  Find the second largest number of a given unsorted array with only one pass
    public static void secondLargest(int[] arr){


    }
    //10.  Swap two numbers without using a third variable
    public static void swapNumbers(int a, int b){
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    //6.  Write a function to check if the array is sorted in ascending or descending or not
    public static void arrayIsSorted(int[] arr){
        if (arr == null || arr.length <= 1) {
        System.out.println("Array is sorted in ascending");
        return;
        }
        boolean isSortedAsc = true;
        boolean isSortedDes = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSortedAsc = false;
            }
            if (arr[i] < arr[i + 1]) {
                isSortedDes = false;
            }
        }
        
        if(isSortedAsc){        
            System.out.println("Array is sorted in ascending");
        }
        else if(isSortedDes){
            System.out.println("Array is sorted in descending");
        }  
        else{
            System.out.println("array is not sorted");
        }
    }

    // 12.  Compress the given string “aaabcddeeee” into a2bcd2e4 
    public static void compressString(String str){
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i));
                if (count > 1) {
                    compressed.append(count);
                }
                count = 1;
            }
        }
        System.out.println("Compressed string: " + compressed.toString());
    }

    
    //13. given an integer array, move all zeros to the end.
    public static void movingZeros(int[] arr){
        int n = arr.length;
        int count = 0; 
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < n) {
            arr[count++] = 0;
        }
        System.out.println("Array is: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]);
        }
    }

    //17.  Given two arrays, arr1 and arr2, check whether arr2 is a subset of arr1 (i.e., all elements of arr2 are present in arr1)
    public static void checkSubset(int[] arr1, int[] arr2){
        for(int i = 0; i < arr2.length; i++){
            boolean found = false;
            for(int j = 0; j < arr1.length; j++){
                if(arr1[j] == arr2[i]){
                    found = true;
                    continue;
                }
            }
            if(!found){
                System.out.println("arr2 is not a subset of arr1");
                return;
            }
            else{ System.out.println("Array 2 is a subset of array 1");}
        }
        
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        //String str = "aaabbccddeeeebb";
        System.out.println("Enter the array elements: ");
        int[] arr1 = new int[a];
        for(int i = 0; i < a; i++){
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[b];
        for(int i = 0; i < b; i++){
            arr2[i] = sc.nextInt();
        }
        // movingZeros(arr);
        // arrayIsSorted(arr);
        // reverseArray(arr);
        // findDuplicates(arr);
        // swapNumbers(a, b);
        // sc.close();
        // compressString(str);
        checkSubset(arr1, arr2);
    }
}

