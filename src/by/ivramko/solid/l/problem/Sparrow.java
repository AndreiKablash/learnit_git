package by.ivramko.solid.l.problem;

public class Sparrow implements Bird {
    @Override
    public void eat() {
        System.out.println("Sparrow  eats");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow  flies");
    }
}
