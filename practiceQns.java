import java.util.Scanner;

public class practiceQns {
    
    //given an integer array, move all zeros to the end.
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

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int a = sc.nextInt();
        System.out.println("Enter the array elements: ");
        int[] arr = new int[a];
        for(int i = 0; i < a; i++){
            arr[i] = sc.nextInt();
        }
        movingZeros(arr);



    }
}

