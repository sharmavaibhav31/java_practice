import java.util.Scanner;;

public class practiceDayThird {
    // Determin the first positive number where its English spelling is in the
    // ascending order as per english alphabet.
    public static void firstAscendingSpellingNumber() {
        String[] spelling = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
                "twenty",
                "twentyone", "twentytwo", "twentythree", "twentyfour", "twentyfive", "twentysix", "twentyseven",
                "twentyeight", "twentynine", "thirty",
                "thirtyone", "thirtytwo", "thirtythree", "thirtyfour", "thirtyfive", "thirtysix", "thirtyseven",
                "thirtyeight", "thirtynine", "forty",
                "fortyone", "fortytwo", "fortythree", "fortyfour", "fortyfive", "fortysix", "fortyseven", "fortyeight",
                "fortynine", "fifty",
                "fiftyone", "fiftytwo", "fiftythree", "fiftyfour", "fiftyfive", "fiftysix", "fiftyseven", "fiftyeight",
                "fiftynine", "sixty",
                "sixtyone", "sixtytwo", "sixtythree", "sixtyfour", "sixtyfive", "sixtysix", "sixtyseven", "sixtyeight",
                "sixtynine", "seventy",
                "seventyone", "seventytwo", "seventythree", "seventyfour", "seventyfive", "seventysix", "seventyseven",
                "seventyeight", "seventynine", "eighty",
                "eightyone", "eightytwo", "eightythree", "eightyfour", "eightyfive", "eightysix", "eightyseven",
                "eightyeight", "eightynine", "ninety",
                "ninetyone", "ninetytwo", "ninetythree", "ninetyfour", "ninetyfive", "ninetysix", "ninetyseven",
                "ninetyeight", "ninetynine", "one hundred" };
        // String spellStr = spelling.toString();
        boolean isAscending;
        for (int j = 0; j <= spelling.length - 1; j++) {
            isAscending = true;
            int i;
            for (i = 1; i < spelling[j].length(); i++) {
                if (spelling[j].charAt(i) < spelling[j].charAt(i - 1)) {
                    isAscending = false;
                    break;
                }
            }
            if (isAscending) {
                System.out.println(
                        "The first positive number with ascending English spelling is: " + spelling[j] + " " + (j + 1));
            }
        }
    }

    //2. Given an array of n+1 integers where each integer is between 1 and n (inclusive), there is exactly one duplicate number. FInd the duplicate number using only for/while loop
    public static void findDup(int[] arr){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        boolean found = false;
        while(start<end){
            if(arr[start] != arr[end]){
                found = false;
                start++;
                end--;
            }
            else{
                found = true;
                break;
            }
        }
        if(found) System.out.println("Found Duplicate integer: " + arr[start]);
        else System.out.println("No duplicate integer found");
    }

    //3. Given an array representing heights of vertical lines drawn on x-axis, 
    // find two lines which together with x-axis forms a container such that the container contains the most water. use recursion to solve this problem.
    //Return the maximum amount of water a container can store.
    public static void maxWaterContainer(int[] heights){
        int n = heights.length;
        int maxArea = 0;
        int right = 0;
        int left = n - 1;
    
        while(left < right){
            int height = Math.min(heights[left], heights[right]);
            int base = right - left;
            int area = height * base;
            maxArea = Math.max(area, maxArea);
            if(heights[left] <= heights[right]){
                left++;
            } else {
                right--;
            }
        }
        System.out.println("The maximum amount of water a container can store is: " + maxArea);      
    }

    /*
    4. You are given a 2D grid representing a room. “0” represents an empty tile, “1” represents a wall and “2” represents a Zombie.  
    When a Zombie is placed on a tile, it infects all connected "empty" tiles (Up, Down, Left, Right) recursively.
    Your Challenge: Given a starting coordinate (r, c) for a new Zombie, write a recursive function to turn all reachable 0s into 2s.
    */ 

    public static void ZombieGrid(int[][] grid, int x, int y){
        if(x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] != 0){
            return;
        }
        System.out.println("The updated grid after infection: ");
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        grid[x][y] = 2;
        ZombieGrid(grid, x + 1, y); // down
        ZombieGrid(grid, x - 1, y); // up
        ZombieGrid(grid, x, y + 1); // right
        ZombieGrid(grid, x, y - 1); // left
    }

    /*
    5. Given a string “s” and a dictionary of strings wordDict, add spaces in s to construct a sentence where each word is a valid dictionary word. 
    Return all such possible sentences in any order.
    Input: s = "catsanddog",
    wordDict = ["cat","cats","and","sand","dog"]
    Output: ["cats and dog","cat sand dog"]

    Input: s = "catsandog",
    wordDict = ["cats","dog","sand","and","cat"]
    Output: []

    1. Traverse each character in String
    2. Check if the substring from start to current character exists in wordDict
    3. If it exists, recursively call the function for the remaining substring
    4. If the end of the string is reached, add the constructed sentence to the result list
    5. Backtrack to explore other possible segmentations
    6. Return the result list containing all valid sentences
    7. If no valid segmentation is found, return an empty list
    */

    public static void wordSplit(String s, String[] wordDict){
        for(int i = 0; i < s.length(); i++){
            String prefix = s.substring(0, i + 1);
            for(String word : wordDict){
                if(prefix.equals(word)){
                    String suffix = s.substring(i + 1);
                    System.out.println("Prefix: " + prefix + ", Suffix: " + suffix);
                    if(suffix.length() == 0){
                        return;
                    }
                    wordSplit(suffix, wordDict);
                }
            }
        }
    }


    /*
    6.  Find if a given string is valid or not. A string is valid if you can generate it by inserting the characters “abc” any number of times starting from an empty string
    Input1: aabcbc
    Output: Valid.  
    Since the input string can be obtained by inserting abc into empty string and then again abc after the first a (aabcbc)

    Input2: abcabcabc
    Output: Valid.  

    Input3: abccba
    Output: Not Valid
    */

    public static void validString(String str){
        while(str.contains("abc")){
            str = str.replace("abc", "");
        }
        if(str.isEmpty()){
            System.out.println("The string is valid");
        } else {
            System.out.println("The string is not valid");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of the array: ");
        // int n = sc.nextInt();
        // int[] array = new int[n];
        // System.out.println("Enter the array elements:  ");
        //  for (int i = 0; i < n; i++) {
        //      array[i] = sc.nextInt();
        // }
        // String[] wordDict = {"cat","cats","and","sand","dog"};
        // String s = "catsanddog";
        // wordSplit(s, wordDict);
        // int[][] ZombieMat = {
        //             {1,1,1,1,1},
        //             {1,0,0,0,1},
        //             {1,0,0,0,1},
        //             {1,0,0,0,1},
        //             {1,1,1,1,1}
        //             };
        // ZombieGrid(ZombieMat, 2, 1);
        //findDup(array);
        //firstAscendingSpellingNumber();
        //maxWaterContainer(array);
        validString("abcabcabc"); 
        sc.close();
    }
}
