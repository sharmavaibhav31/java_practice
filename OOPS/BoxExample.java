import java.util.Scanner;

class Box {
    double length, width, height;

    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    double calculateVolume() {
        return length * width * height;
    }

    void displayDetails() {
        System.out.println("Box Dimensions:" + length + " X " + width + " X " + height);
        System.out.println("Volume:" + calculateVolume());
    }

    double calculateSurfaceArea() {
        return 2 * ((length * width) + (width * height) + (length * height));
    }
}

public class BoxExample {
    public static void main(String[] args) {
        double len, wid, hei;
        Box box;
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the number of box required:\n");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the dimensions of box %d:", i);
            len = input.nextDouble();
            wid = input.nextDouble();
            hei = input.nextDouble();
            box = new Box(len, wid, hei);
        }
        box.displayDetails();
        // Box2.displayDetails();

        System.out.println("Box 1 volume:" + Box1.calculateVolume());
        System.out.println("Box 2 volume:" + Box2.calculateVolume());
        System.out.println("Box 1 area:" + Box1.calculateSurfaceArea());
        System.out.println("Box 2 area:" + Box2.calculateSurfaceArea());

        input.close();

    }
}