import java.util.Scanner;

class totalPriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter unit price: ");
        double unitPrice = scanner.nextDouble();
        System.out.print("Do you want discount? ");
        char choice = scanner.next().charAt(0);
        double totalPrice = quantity * unitPrice;
        if (choice == 'y') {
            double discount = totalPrice * 0.08;
            totalPrice -= discount;
        }
        System.out.println("Total Price: " + totalPrice);
        scanner.close();
    }
}