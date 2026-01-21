import java.util.*;

public class practiceDaySecond {

    /*
     * Given an array of integers, write a function that identifies the Pythagorean
     * triplets (a, b, c) that satisfies a*a + b*b = c*c.
     * - For input of {3, 1, 4, 6, 5}, output should be “True – (3, 4 and 5) are
     * Pythagorean triplets”
     * - For input of {10, 4, 6, 12, 5}, output should be “False, there are no
     * Pythagorean triplets”
     * - For input of {3,5,4,13,12}, output should be “True – (3,4 and 5), (12, 5
     * and 13) are Pythagorean triplets”
     */

    public static void pythogoreanTriplets(int[] arr) {
        int n = arr.length;
        boolean isPgt = false;

        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] * arr[i];
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (arr[i] + arr[j] == arr[k]) {
                        System.out.println("True\n Pythagorean triplet found: " + Math.sqrt(arr[i]) + ", "
                                + Math.sqrt(arr[j]) + ", " + Math.sqrt(arr[k]));
                        isPgt = true;
                    }
                }
            }
        }
    }

    // Find all the Armstrong numbers less than 999
    public static void findArmstrongNumbers() {
        System.out.println("Armstrong numbers less than 999 are: ");
        for (int num = 1; num < 999; num++) {
            int sum = 0;
            int temp = num;
            int digits = Integer.toString(num).length();
            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }
            if (sum == num) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    // Find the left and right diagonal sums of a n x n square matrix
    public static void diagonalSums(int[][] matrix) {
        int n = matrix.length;
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;

        for (int i = 0; i < n; i++) {
            leftDiagonalSum += matrix[i][i];
            rightDiagonalSum += matrix[i][n - i - 1]; // i + j = n - 1 === i = 0 ,j = 0
        }

        System.out.println("Left Diagonal Sum: " + leftDiagonalSum);
        System.out.println("Right Diagonal Sum: " + rightDiagonalSum);
    }

    // Find the sum of all numbers below and above the left diagonal
    public static void sumAboveBelowLeftDiagonal(int[][] matrix) {
        int n = matrix.length;
        int sumAbove = 0;
        int sumBelow = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j > i) {
                    sumAbove += matrix[i][j];
                } else if (j < i) {
                    sumBelow += matrix[i][j];
                }
            }
        }

        System.out.println("Sum Above Left Diagonal: " + sumAbove);
        System.out.println("Sum Below Left Diagonal: " + sumBelow);
    }

    /*
     * Find the longest substring without repeating characters inside a given
     * string.
     * 
     * Input: HelloWorld Output: World
     * 
     * Input: dvdf Output: vdf
     * 
     * Input: abbas Output: bas
     * 
     */
    public static void longestSubstring(String str) {
        int n = str.length();
        String longestSubstr = "";
        for (int i = 0; i < n; i++) {
            Set<Character> charSet = new HashSet<>();
            String currentSubstr = "";
            for (int j = i; j < n; j++) {
                char ch = str.charAt(j);
                if (!charSet.contains(ch)) {
                    charSet.add(ch);
                    currentSubstr += ch;
                } else {
                    break;
                }
            }
            if (currentSubstr.length() > longestSubstr.length()) {
                longestSubstr = currentSubstr;
            }
        }
        System.out.println("Longest substring without repeating characters: " + longestSubstr);
    }

    /*
     * A fintech company system receives time series data from two different market
     * data feeds that need to be merged, analyzed, and processed efficiently.
     * Memory usage and processing speed are critical constraints due to the large
     * volume of real-time data.
     * Each data feed is a sorted list of tuples with format (timestamp, value).
     * Timestamp is an integer representing Unix timestamp (time elapsed since
     * origin of time)
     * Write functions to
     * - Merge two data sets in place and also into a third list
     * - Determine overlapping time periods with a 30 second window Data stream
     * 
     * # Market Feed A (NYSE data)
     * feed_a = [
     * (1609459200, 150.25), # 2021-01-01 00:00:00
     * (1609459260, 150.80), # 2021-01-01 00:01:00
     * (1609459320, 151.15), # 2021-01-01 00:02:00
     * (1609459380, 150.90), # 2021-01-01 00:03:00
     * (1609459500, 151.40), # 2021-01-01 00:05:00
     * (1609459620, 151.75), # 2021-01-01 00:07:00
     * ]
     * 
     * # Market Feed B (NASDAQ data)
     * feed_b = [
     * (1609459220, 2500.30), # 2021-01-01 00:00:20
     * (1609459280, 2501.15), # 2021-01-01 00:01:20
     * (1609459400, 2499.80), # 2021-01-01 00:03:20
     * (1609459460, 2502.45), # 2021-01-01 00:04:20
     * (1609459580, 2503.10), # 2021-01-01 00:06:20
     * (1609459640, 2504.25), # 2021-01-01 00:07:20
     * ]
     */

    public static void mergeDataFeeds(List<int[]> feedA, List<int[]> feedB) {
        List<double[]> merged = new ArrayList<>();
        int i = 0, j = 0;

        while (i < feedA.size() && j < feedB.size()) {
            if (feedA.get(i)[0] <= feedB.get(j)[0]) {
                merged.add(feedA.get(i++));
            } else {
                merged.add(feedB.get(j++));
            }
        }
        while (i < feedA.size())
            merged.add(feedA.get(i++));
        while (j < feedB.size())
            merged.add(feedB.get(j++));

        int j = 0;
        int window = 30; // seconds

        for (double[] pointA : feedA) {
            double timeA = pointA[0];

            // Move pointer j to catch up to the window
            while (j < feedB.size() && feedB.get(j)[0] < timeA - window) {
                j++;
            }

            // Check all points in Feed B that fall within the window of Point A
            int tempJ = j;
            while (tempJ < feedB.size() && feedB.get(tempJ)[0] <= timeA + window) {
                System.out.println("Overlap Found: Feed A (" + timeA + ") and Feed B ("
                        + feedB.get(tempJ)[0] + ")");
                tempJ++;
            }
        }
    }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of array: ");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // System.out.println("Enter the array elemetns: ");
        // for(int i = 0; i < n; i++){
        // arr[i] = sc.nextInt();
        // }
        // pythogoreanTriplets(arr);
        int n = 4;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // findArmstrongNumbers();
        // diagonalSums(matrix);
        sumAboveBelowLeftDiagonal(matrix);

        sc.close();
    }
}
