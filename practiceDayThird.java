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
            if(arr[start] == arr[end]){
                found = true;
                break;
            }
            else{
                end--;
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



    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the array elements:  ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int[][] ZombieMat = {
                    {1,1,1,1,1},
                    {1,0,0,0,1},
                    {1,0,2,0,1},
                    {1,0,0,0,1},
                    {1,1,1,1,1}
                    };
        //findDup(array);
        //firstAscendingSpellingNumber();
        maxWaterContainer(array);
        sc.close();
    }
}
