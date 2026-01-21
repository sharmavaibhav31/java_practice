import java.util.*;

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
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] != firstLargest){
                secondLargest = arr[i];
            }
        }
        System.out.println("Second largest number is: " + secondLargest);
    }

    //4.  Find the missing number in an array of size N containing numbers from 1 to N+1 without using hashmaps 
    public static void missingNumber(int[] arr){
        int n = arr.length + 1;
        int total = n * (n + 1) / 2;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        int missingNumber = total - sum;
        System.out.println("Missing number is: " + missingNumber);
    }

    //5.  Reverse a string without using built-in string functions
    public static void reverseStrings(String str){
        char[] array = str.toCharArray();
        int start = 0;
        int end = array.length - 1;
        while(start < end){
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        String reversedStr = new String(array);
        System.out.println("Reversed string is: " + reversedStr);
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

    //7.  Find the largest repeating element of an array 
    public static void largestRepeatingElement(int[] arr){
        System.out.println("Largest repeating element is: ");
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length ;j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i] + " ");
                }
            }
        }
    }

    //9.  Find the first repeating element of an array
    public static void firstRepeatingElement(int[] arr){
        System.out.println("First repeating element is: ");
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i] + " ");
                    return;
                }
            }
        }
    }

    //10.  Swap two numbers without using a third variable
    public static void swapNumbers(int a, int b){
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    //11.  Count the number of times a character repeats in a string 
    public static void countRepChar(String str){
        Map<Character, Integer> charCountMap = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        System.out.println("Character counts are: ");
        for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
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

    //14.  Write a program to print all the LEADERS in the array. An element is a leader if it is greater than all the elements to its right side. The rightmost element is always a leader.
    public static void printLeaders(int[] arr){
        int n = arr.length;
        int rightMost = arr[n-1];
        System.out.println("Leaders in the array are: ");
        System.out.print(rightMost + " ");
        for(int i = n - 2; i >= 0; i--){
            if(arr[i] > rightMost){
                rightMost = arr[i];
                System.out.print(rightMost + " ");
            }
        }
    }

    //16.  Given an array of integers, modify the array such that all even numbers appear at the beginning and all odd numbers appear at the end. The order of numbers does not matter.
    public static void evenOddArray(int[] arr){
        // int[] arrn = new int[arr.length];
        // Arrays.sort(arr);
        // for(int i = 0; i <arr.length; i++){
        //     arrn[i] = arr[i];
        // }
        int left = 0;
        int right = arr.length - 1;
        // while(left < right){
        //     if(arr[left] % 2 == 0){
        //         left++;
        //     }
        //     else if(arr[right] % 2 != 0){
        //         right--;
        //     }
        //     else{
        //         int temp = arr[left];
        //         arr[left] = arr[right];
        //         arr[right] = temp;
        //         left++;
        //         right--;
        //     }
        // }
        while(left < right){
            while(arr[left] % 2 == 0 && left < right){
                left++;
            }
            while(arr[right] % 2 != 0 && left < right){
                right--;
            }
            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
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

    /*
    18.  Given an array nums, return an array where each element is the product of all elements except itself. Do it without using division and in O(n) time.
    # Input: [1,2,3,4]
    # Output: [24,12,8,6] 
    */

    public static int[] productArray(int[] nums){
        // int n = nums.length;
        // int[] result = new int[n];
        // Arrays.fill(result, 1);

        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < n; j++){
        //         if(i != j){
        //             result[i] *= nums[j];
        //         }
        //     }
        // }
        // for(int i = 0; i < nums.length; i++){
        //     System.out.print(result[i] + " ");
        // }
        // return result;      
        int n = nums.length;
        int leftProduct = 1;
        int rightProduct = 1;
        int[] result = new int[n];;
        Arrays.fill(result, 1);

        for (int i = 0; i < n; i++) {
            result[i] = leftProduct;
            leftProduct *= nums[i];
        }    

        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        System.out.println("Product array is: ");
        for(int i = 0; i < n; i++){
            System.out.print(result[i] + "  ");
        }      
        return result;
    }

    /*
    19.    Find all unique triplets in the array that sum to zero.
    # Input: [-1,0,1,2,-1,-4]
    # Output: [[-1,-1,2],[-1,0,1]]
    Try for zero.
    */
    public static void uniqueTriplets(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = 0; k < n; k++){
                        if(arr[i] + arr[j] == arr[k]){
                            System.out.println("Triplet found: " + arr[i] + ", " + arr[j] + ", " + arr[k]);
                    }
                }
            }
        }
    }

    /*
    21.  Group all anagrams together in an array of words
    Input
    - {“eat”, “ant”, “tan”, “ate”, “tea”)
    Output
    – {“eat”, “ate”, “tea”, “ant”, “tan”}
    Use HashMap for implementation
    */
    public static void groupAnagrams(String[] words){
        Map<String, List<String>> map = new HashMap<>();
        for(String word : words){
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);
            if(!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }
        List<List<String>> result = new ArrayList<>(map.values());
        System.out.println("Grouped anagrams are: ");
        for(List<String> group : result){
            System.out.println(group);
        }
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        System.out.println(" Array after removing duplicates: ");
        for(int k = 0; k <= i; k++){
            System.out.print(nums[k] + " ");
        }
        return i + 1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int a = sc.nextInt();
        // int b = sc.nextInt();
        // String str = "aaabbccddeeeebb";
        // System.out.println("Enter the array elements: ");
        int[] arr1 = new int[a];
        for(int i = 0; i < a; i++){
            arr1[i] = sc.nextInt();
        }
        // int[] arr2 = new int[b];
        // for(int i = 0; i < b; i++){
        //     arr2[i] = sc.nextInt();
        // }
        // movingZeros(arr1);
        // arrayIsSorted(arr1);
        // secondLargest(arr1);
        // firstRepeatingElement(arr1);
        // largestRepeatingElement(arr1);
        // reverseArray(arr1);
        // findDuplicates(arr1);
        // countRepChar(str);
        // swapNumbers(a, b);
        // compressString(str);
        // checkSubset(arr1, arr2);
        // reverseStrings(str);
        // evenOddArray(arr2);
        // productArray(arr2);
        // missingNumber(arr1);
        // printLeaders(arr1);
        // uniqueTriplets(new int[]{-1,0,1,2,-1,-4});     
        removeDuplicates(new int[]{1,1,2,2,3,4,4,5});   
        //groupAnagrams(new String[]{"eat", "ant", "tan", "ate", "tea"});

        sc.close();


        
    }
}

