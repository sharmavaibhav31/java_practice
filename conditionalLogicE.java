import java.util.Scanner;

public class conditionalLogicE {
   /* Geometric conditions
   Questions:
   (10) Triangle validity
   (11) Triangle type
   Simple transformations
   Questions:
   (17) Absolute value (no library)
   (19) String compare (manual)
   */

   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    // To check the validity of Triangle
    if(a + b > c && a + c > b && b + c > a){
        System.out.println("Triangle is valid");
    }
    else{
        System.out.println("Triangle is Invalid");
    }



   }

}
