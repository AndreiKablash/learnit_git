package by.ivramko.solid.l.problem;

public class Ostrich implements Bird {
    @Override
    public void eat() {
        System.out.println("Ostrich eats");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException();
    }
}
