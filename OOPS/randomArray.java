//import java.util.Scanner;
import java.util.Random;


public class randomArray {
    public static void main(String[] args) {
        int []arr = new int[10];
        Random random = new Random();
        
        for (int i = 0; i < 10; i++) {
            arr[i]=random.nextInt(100);
        }

        System.out.printf("The random array is:");
        for(int i=0; i<10; i++){
            System.out.printf("\t"+arr[i]);
        }
    }
}

