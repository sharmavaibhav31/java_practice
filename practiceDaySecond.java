import java.util.*;

public class practiceDaySecond {
    // Given an array of intgers, write a function that identifies the Pythagorean triplets (a,b,c) that is satisfying a^2 + b^2 = c^2 in the array.
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
                        System.out.println("Pythagorean triplet found: " + Math.sqrt(arr[i]) + ", " + Math.sqrt(arr[j]) + ", " + Math.sqrt(arr[k]));
                        isPgt = true;
                    }
                }
            }
        }

        for(int i=0; i<n; i++){
            System.out.println("PGT found");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elemetns: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        pythogoreanTriplets(arr);
    }
}
