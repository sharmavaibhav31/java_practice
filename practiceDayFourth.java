public class practiceDayFourth {


    /*
    1.  You are given an array of integers and a sliding window of size 'k' 
    (less than number of elements in the array) which is moving from the very left of the array to the very right. 
    You can only see the k numbers in the window. Each time the sliding window moves right by one position. 
    Print the maximum of elements in each position of the sliding window as an array
    */
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        // if (n == 0 || k == 0) return new int[0];
        // int[] maxArr = new int[n-k+1];

        // for (int i = 0; i <= n - k; i++) {
        //     int[] currentWindow = Arrays.copyOfRange(nums, i, i + k);
        //     int max = currentWindow[0];
        //     for (int j = 1; j < k; j++) {
        //         if (currentWindow[j] > max) {
        //             max = currentWindow[j];
        //         }
        //     }
        //     maxArr[i] = max;
        // }
        // return maxArr;

        int[] left = new int[n];
        int[] right = new int[n];
        int[] maxArr = new int[n-k+1];

        for(int i = 0; i < n - 2; i++){
            left[i] = Math.max(nums[i], Math.max(nums[i+1], nums[i+2]));
        }
        for(int i = n - 2; i > 0; i--){
            right[i] = Math.max(nums[i], Math.max(nums[i+1], nums[i+2]));
        }
        int i = 0;
        while(i < n-k+1){
            maxArr[i] = Math.max(left[i], right[i]);
            i++;
        }

        return maxArr;
    }

    /*
    2.  Print and Count the number of ideal arrays given a positive integer n and the following conditions
        1. ideal array consists of two elements
        2. each element of the ideal array can start from 1 and be up to n
        3. second element of the array must be divisible by first element of the array
        4. Both the array elements can have the same value
    */

    public static void idealArray(int n){
        int count = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(j % i == 0){
                    System.out.println("[" + i + ", " + j + "]");
                    count++;
                }
            }
        }
        System.out.println("Total number of ideal arrays: " + count);
    }

    /*
    3.  Return the number of steps needed to make the given array empty by following the rules below
     1. If the first element is the smallest, remove it
     2. If the first element is not the smallest, move that element to the end
    */

     public static int countSteps(int[] arr){
        int steps = 0;
        int n = arr.length;
        while(n > 0){
            int minIndex = 0;
            for(int i = 0; i < n; i++){
                if(arr[i] < arr[minIndex]){
                    minIndex = i;
                }
            }
            if(minIndex == 0){
                for(int i = 1; i < n; i++){
                    arr[i-1] = arr[i];
                }
            }
        }
        
        
        // int steps = 0;
        // int n = arr.length;
        // while(n > 0){
        //     int minIndex = 0;
        //     for(int i = 1; i < n; i++){
        //         if(arr[i] < arr[minIndex]){
        //             minIndex = i;
        //         }
        //     }
        //     if(minIndex == 0){
        //         // remove first element
        //         int[] newArr = new int[n-1];
        //         for(int i = 1; i < n; i++){
        //             newArr[i-1] = arr[i];
        //         }
        //         arr = newArr;
        //         n--;
        //     } else {
        //         // move first element to end
        //         int firstElement = arr[0];
        //         int[] newArr = new int[n];
        //         for(int i = 1; i < n; i++){
        //             newArr[i-1] = arr[i];
        //         }
        //         newArr[n-1] = firstElement;
        //         arr = newArr;
        //     }
        //     steps++;
        // }
        // return steps;

     }



    //5. Given two strings, check if the second string is a rotation of the first string.
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        else{
        String newStr = s + s;
        return newStr.contains(goal);
        }
    }

    public static void main(String[] args) {
        // int[] nums = {1,3,-1,-3,5,3,6,7};
        // int k = 3;
        // practiceDayFourth obj = new practiceDayFourth();
        // int[] result = obj.maxSlidingWindow(nums, k);
        // System.out.print("The maximums of each sliding window are: ");
        // for(int num : result){
        //     System.out.print(num + " ");
        // }
        // System.out.println();

        int n = 5;
        System.out.println("The ideal arrays for n = " + n + " are: ");
        idealArray(n);
    }
    
}
