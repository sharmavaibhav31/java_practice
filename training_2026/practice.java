
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] array = {2,1,3,2,4,3};
        int l = 0; int sum = 0, target = 7;
        int win = 0; int min = Integer.MAX_VALUE;
        for(int r = 0; r < array.length; r++){
            sum += array[r];
            while(sum >= target){
                sum = sum - array[l];
                l++;
                if(sum >= target){
                    win = r - l + 1;
                    min = Math.min(win, min);
                }
            }
        }
        System.out.println(min);
        
    }
}


//-------------------------------------------------------------------------------------------------------------

class Solution {
    public static int maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n == 0 || k == 0) return ;
        int max = 0;
        int res = 0;
        int sum = 0;
        for(int i = 0; i < k; i++){
            res+=nums[i];
        }
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i]; 
            for (int j = i+1; j < k; j++) {
                sum = sum - nums[0] + nums[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
    
    public static void main(String[] args){
        int[] nums = {2, 1, 5, 1, 3, 2};
        int k = 3;
        maxSlidingWindow(nums, k);
        System.out.println(max);
    }
}








//-=------------------------------=--------------------------------
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public List<List<Integer>> threeSumWithAllPairs(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        List<List<Integer>> allPairs = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0;
        int l = i+1; int r = n - 1;
        while(l < r && i < nums.length - 2){
            if(target == nums[i] + nums[l] + nums [r]){
                result.add(nums[i]);
                result.add(nums[l]);
                result.add(nums[r]);
                allPairs.add(result);
            }
            if(target < nums[i] + nums[l] + nums [r]) l++;
            if(target > nums[i] + nums[l] + nums [r]) r--;
            i++;
        }
        return allPairs;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        int[] nums = {1, 2, 4, 3, 5, 6, 8, 10, 12};
        int target = 12;
        List<List<Integer>> result = obj.threeSumWithAllPairs(nums, target);
        if (result.isEmpty()) {
            System.out.println("No pair found");
        } else {
            for (List<Integer> pair : result) {
                System.out.println(pair.get(0) + " " + pair.get(1));
            }
        }
    }
}
