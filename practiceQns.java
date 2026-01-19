import java.util.Scanner;

public class practiceQns {


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

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int a = sc.nextInt();
        System.out.println("Enter the array elements: ");
        int[] arr = new int[a];
        for(int i = 0; i < a; i++){
            arr[i] = sc.nextInt();
        }
        //movingZeros(arr);
        arrayIsSorted(arr);
    }
}

