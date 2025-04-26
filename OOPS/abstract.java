abstract class Shape{
    abstract void draw();

    void display(){
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape{
    //@Override
    void draw(){
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape{
    //@Override
    void draw(){
        System.out.println("Drawing a rectangle");
    }
}


public class abstract {
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle();
        R1.draw();
        Circle C1 = new Circle();
        C1.draw();
    }


    @Override
    public String toString() {
        return "Rectangle []";
    }
}
