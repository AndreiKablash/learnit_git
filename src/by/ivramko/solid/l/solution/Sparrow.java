package by.ivramko.solid.l.solution;

public class Sparrow implements FlyingBird {


    @Override
    public void fly() {
        System.out.println("Sparrow flies");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow eats");
    }
}
