import java.util.*;

public class practiceDaySecond {

    /*
    Given an array of integers, write a function that identifies the Pythagorean triplets (a, b, c) that satisfies a*a + b*b = c*c.
     - For input of {3, 1, 4, 6, 5}, output should be “True – (3, 4 and 5) are Pythagorean triplets”
     - For input of {10, 4, 6, 12, 5}, output should be “False, there are no Pythagorean triplets”
     - For input of {3,5,4,13,12}, output should be “True – (3,4 and 5), (12, 5 and 13) are Pythagorean triplets”
   */
    
    public static void pythogoreanTriplets(int[] arr){
        int n = arr.length;
        boolean isPgt = false;
        
        for(int i = 0; i < n; i++){
            arr[i] = arr[i] * arr[i];
        }

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = 0; k < n; k++){
                    if(arr[i] + arr[j] == arr[k]){
                        System.out.println("True\n Pythagorean triplet found: " + Math.sqrt(arr[i]) + ", " + Math.sqrt(arr[j]) + ", " + Math.sqrt(arr[k]));
                        isPgt = true;
                    }
                }
            }
        }
    }

    //Find all the Armstrong numbers less than 999
    public static void findArmstrongNumbers(){
        System.out.println("Armstrong numbers less than 999 are: ");
        for(int num = 1; num < 999; num++){
            int sum = 0;
            int temp = num;
            int digits = Integer.toString(num).length();
            while(temp != 0){
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }
            if(sum == num){
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    //Find the left and right diagonal sums of a n x n square matrix
    public static void diagonalSums(int[][] matrix){
        int n = matrix.length;
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;

        for(int i = 0; i < n; i++){
            leftDiagonalSum += matrix[i][i];
            rightDiagonalSum += matrix[i][n - i - 1];
        }

        System.out.println("Left Diagonal Sum: " + leftDiagonalSum);
        System.out.println("Right Diagonal Sum: " + rightDiagonalSum);
    }

    //Find the sum of all numbers below and above the left diagonal
    public static void sumAboveBelowDiagonal(int[][] matrix){
        int n = matrix.length;
        int sumAbove = 0;
        int sumBelow = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(j >= i){
                    sumAbove += matrix[i][j];
                } else if(j <= i){
                    sumBelow += matrix[i][j];
                }
            }
        }

        System.out.println("Sum Above Left Diagonal: " + sumAbove);
        System.out.println("Sum Below Left Diagonal: " + sumBelow);
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of array: ");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // System.out.println("Enter the array elemetns: ");
        // for(int i = 0; i < n; i++){
        //     arr[i] = sc.nextInt();
        // }
        // pythogoreanTriplets(arr);
        int n = 4;
        int[][] matrix = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //findArmstrongNumbers();
        //diagonalSums(matrix);
        sumAboveBelowDiagonal(matrix);
        sc.close();
    }
}
