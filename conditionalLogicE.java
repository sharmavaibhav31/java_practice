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
        // To check the trianle type
        if(a == b && b == c && a == c){
            System.out.print("Equilateral Triangle");
        }
        else if (a == b && b == c){
            System.out.println("Isoceles Triangle");
        }
        else{System.out.println("Scalene triangle");}
    }
    else{
        System.out.println("Triangle is Invalid");
    }

    // To find absolute value without a library

    int num = sc.nextInt();
    if(num < 0){
        num = -num;
        System.out.println("Abs of Num is " + num);
    }
    else{
        System.out.println("Abs of Num is " + num);
    }

    String str1 = sc.next();
    String str2 = sc.next();

    if(str1.length() != str2.length()) {
        System.out.println("String length unmatched");
    }
    
    for(int i = 0; i < str1.length(); i++){
        if(str1.charAt(i) != str2.charAt(i)){
            System.out.println("Strings not matched");
        }
        else{
            System.out.println("Strings Matched");
        }
    }

    sc.close();

   }
}
