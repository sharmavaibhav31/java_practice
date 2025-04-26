interface Greeting {
    private void log(String message) {
        System.out.println("LOG: " + message);
    }

    default void sayHello() {
        log("Hello");
    }

    default void sayGoodBye() {
        log("Goodbye");
    }
}

class Greeter implements Greeting {
    // nothing needed
}

public class privateInterface {
    public static void main(String[] args) {
        Greeter g = new Greeter();
        g.sayHello();
        g.sayGoodBye();
    }
}
