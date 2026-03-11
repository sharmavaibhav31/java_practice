package fundamentals.assignments;
import fundamentals.assignments.Animal;
import fundamentals.assignments.Playable;

public class Dog extends Animal implements Playable {
    @Override
    public void sound() {
        System.out.println("Woof Woof");
    }

    @Override
    public void play() {
        System.out.println("Dog can play: Yes");
    }
}
