public class practiceDaySix {

    /*
    You are hopping across a river using floating stones marked with numbers.
    Rule 1: You can hop on to any stone to start with
    RUle 2: The next step should be to the stone with number greater than the current stone
    */ 
    
    /*
    Generate the N sets of X and Y coordinates corresponding to positions of free end of a rod Y cm long, 
    which is pivoted abput the point (0,X) at the other end so that it is free to rotate clockwise with (0,X) as center.
    X,Y,N are user inputs and must be all positive
    output coordinates must have 4 decimal places
    The output should be equidistant from each other in the circular coordinates,
    Use Circle Formula
    */

    public static void findCoordinate(int X, int Y, int N){
        int[] pivot = {0, X};
        double equidistAngle = 360.0/N;
        for(int i = 1; i <= N; i++){
            double incrementAngle = i*equidistAngle;
            double angleInRad = incrementAngle * (Math.PI)/180;
            double newCdX = pivot[0] + Y * angleInRad;
            double newCdY = pivot[1] + Y * angleInRad  ;
            System.out.printf("Coordinate %d: (%.4f, %.4f)%n", i+1, newCdX, newCdY);
        }
    }


    /*
    Next Greater Element
    Take an array as user Input and print the next greater element for every element
    The NXE for X is the first greater element on the right side of X in the array
    If no greater element present consider the next greater element to be -1
    */

    public static void nXE(int[] arr){
        int n = arr.length;
        int[] newArr = new int[n];
        for(int i = 0; i < n; i++){
            int nextGr = -1;
            for(int j = i+1; j < n; j++){
                if(arr[j] > arr[i]){
                    nextGr = arr[j];
                    j+=1;
                }
                newArr[i] = nextGr;
            }
        }
        newArr[n-1] = -1;
        for(int i = 0; i<n; i++){
            System.out.println(newArr[i]);
        }
    }

    /*
    Given an input of string S which consists of * and # write a function to find the minimum number of * or # required to make the string Vallid
    The string is Valid if it has equal number of * and #
    The putput must be zero, positive or negative number based on * and # in the given string
    */

    public static int validStr(String s){
        int countStar = 0;
        int countHash = 0;
        for(char ch: s.toCharArray()){
            if(ch == '*'){
                countStar += 1;
            } else if (ch == '#'){
                countHash += 1;
            }
        }
        return countStar - countHash;
    }


    /*
    Rotate a one dimensional array to the right by k steps
    Do it in place with O(1) extra spaces
    use two pointer or recursion
    */

    public static void rotateArray(int[] arr, int k){
        int n = arr.length;
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);       
        for(int i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
        }
    }
    public static void reverse(int[] arr, int start, int end){
            while(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

    public static void main(String[] args){
        //findCoordinate(3, 4, 5);
        // int[] arr = {7, 45, 3, 32, 74};
        // nXE(arr);
        // nXE({[9,8,7,6,10]});
        // nXE([22,33,6,4,2]);
        //System.out.println(validStr("A#B#c"));
        int[] arr = {1,2,3,4,5,6,7};
        rotateArray(arr, 3); 
    }
}
