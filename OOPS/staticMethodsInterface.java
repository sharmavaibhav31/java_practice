interface Mathoperations {
    static int add(int a, int b) {
        return a + b;
    }

    static int square(int a) {
        return a * a;
    }
}

public class staticMethodsInterface {
    public static void main(String[] args) {
        System.out.println(Mathoperations.add(5, 3));
        System.out.println(Mathoperations.square(5));
    }
}
