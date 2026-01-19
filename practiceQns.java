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
    }

    public static void main(String[] args){

    }
}

