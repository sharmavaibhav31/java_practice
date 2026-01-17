/*Bitwise & math tricks
Questions:
(3) Larger of two numbers (no comparison)
(4) Largest of three (min comparisons)
*/

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class conditionalLogicD{
    public static void main(String[] args){
        // To find the larger of two numbers without operators

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        

        int max = a - ((a - b) & ((a - b) >> 31));

        // To print largest of three with minimum comparision
        //int maxT = (a > b ? a > c ? System.out.println("Max is " + a) : )
        if(b > max) max = b;
        if(c > max) max = c;








        sc.close();
    }
}