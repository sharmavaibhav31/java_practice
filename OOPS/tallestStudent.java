import java.util.Scanner;

class tallestStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height of student 1: ");
        double h1 = scanner.nextDouble();
        System.out.print("Enter height of student 2: ");
        double h2 = scanner.nextDouble();
        System.out.print("Enter height of student 3: ");
        double h3 = scanner.nextDouble();
        double tallest = Math.max(h1, Math.max(h2, h3));
        System.out.println("The tallest student is " + tallest + " cm tall.");
        scanner.close();
    }
}