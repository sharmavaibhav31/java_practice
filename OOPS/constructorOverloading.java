//import java.util.Scanner;

class Box {
    double length, width, height;

    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    Box() {
        length = 1;
        width = 1;
        height = 1;
    }

    Box(double l, double h) {
        length = l;
        width = 5;
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

public class constructorOverloading {
    public static void main(String[] args) {
        Box Box1 = new Box(2, 4, 6);
        // Box Box2 = new Box(3, 5, 7);
        // Box Box3 = new Box();
        // Box Box4 = new Box(2, 3);
        Box Box5 = Box1;
        Box1.displayDetails();
        // Box2.displayDetails();
        // Box3.displayDetails();
        // Box4.displayDetails();
        Box5.displayDetails();

        System.out.println("Box 1 volume:" + Box1.calculateVolume());
        // System.out.println("Box 2 volume:" + Box2.calculateVolume());
        // System.out.println("Box 3 volume:" + Box3.calculateVolume());
        // System.out.println("Box 4 volume:" + Box4.calculateVolume());
        System.out.println("Box 5 volume:" + Box5.calculateVolume());
        System.out.println("Box 1 area:" + Box1.calculateSurfaceArea());
        // System.out.println("Box 2 area:" + Box2.calculateSurfaceArea());
        // System.out.println("Box 3 area:" + Box3.calculateSurfaceArea());
        // System.out.println("Box 4 area:" + Box4.calculateSurfaceArea());
        System.out.println("Box 5 area:" + Box5.calculateSurfaceArea());

    }
}
