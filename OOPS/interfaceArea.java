import java.util.Scanner;

interface Area {
    void findArea();
}

class Rectangle implements Area {
    int length;
    int breadth;
    double area;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void findArea() {
        this.area = length * breadth;
    }

    public double getArea() {
        return this.area;
    }
}

class Triangle implements Area {
    int height;
    int base;
    double area;

    public Triangle(int height, int base) {
        this.height = height;
        this.base = base;
    }

    public void findArea() {
        this.area = 0.5 * base * height;
    }

    public double getArea() {
        return this.area;
    }
}

public class interfaceArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length (or height) and breadth (or base) for the shape: ");
        int lengthOrHeight = sc.nextInt();
        int breadthOrBase = sc.nextInt();

        Rectangle rectangle = new Rectangle(lengthOrHeight, breadthOrBase);
        rectangle.findArea();
        System.out.printf("Area of Rectangle: %.2f\n", rectangle.getArea());

        Triangle triangle = new Triangle(lengthOrHeight, breadthOrBase);
        triangle.findArea();
        System.out.printf("Area of Triangle: %.2f\n", triangle.getArea());

        sc.close();
    }
}

// import java.util.Scanner;

// interface Area {
// void findArea();
// }

// class Rectangle implements Area {
// int findArea(int length, int breadth) {
// int area = length * breadth;
// return area;
// }
// }

// class Triangle implements Area {
// double findArea(int height, int base) {
// double area = 0.5 * base * height;
// return area;
// }
// }

// public class interfaceArea {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the length and breadth or height and base for the
// shape: ");
// int lengthOrHeight = sc.nextInt();
// int breadthOrBase = sc.nextInt();
// Area S1 = new Rectangle();
// Area S2 = new Triangle();
// S1.findArea(lengthOrHeight, breadthOrBase);
// System.out.printf("Area: " + area);
// S2.findArea(lengthOrHeight, breadthOrBase);
// System.out.printf("Area: " + area);

// }
// }
