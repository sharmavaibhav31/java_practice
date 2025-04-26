public class student {
    public static void main(String[] args) {
        int[][] marks = {
            {0, 9, 9}, 
            {87, 99, 92}, 
            {76, 78, 79}
        };
        int student=0;
        int topper=0;
        int studentTotal=0;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                studentTotal+=marks[i][j];
            }
            if(studentTotal>topper){
                studentTotal= topper  ;
                student = i;
            }
        }
        // int topper = Math.max(arr[0], Math.max(arr[1], arr[2]));
        System.out.println("Topper:"+student);
    }
}
