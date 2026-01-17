import java.util.Scanner;

/*
GROUP 10: Special Numbers
Questions:
(44) Perfect number
(45) Armstrong number
*/

public class loopBasedLogicI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Perfect Number
        System.out.print("Enter a number to check if it's a Perfect Number: ");
        int num1 = sc.nextInt();
        int sum1 = 0;
        for(int i = 1; i <= num1 / 2; i++){
            if(num1 % i == 0){
                sum1 += i;
            }
        }
        if(sum1 == num1){
            System.out.println(num1 + " is a Perfect Number.");
        } else {
            System.out.println(num1 + " is not a Perfect Number.");
        }

        // Armstrong Number
        System.out.print("Enter a number to check if it's an Armstrong Number: ");
        int num2 = sc.nextInt();
        int originalNum = num2;
        int sum2 = 0;
        int digits = String.valueOf(num2).length();
        while(num2 != 0){
            int digit = num2 % 10;
            sum2 += Math.pow(digit, digits);
            num2 /= 10;
        }
        if(sum2 == originalNum){
            System.out.println(originalNum + " is an Armstrong Number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong Number.");
        }

        sc.close();

    }
    
}
