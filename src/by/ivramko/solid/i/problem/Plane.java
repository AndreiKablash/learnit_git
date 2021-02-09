package by.ivramko.solid.i.problem;

public class Plane implements Vehicle {

    @Override
    public void fly() {
        System.out.println("Plane flies");
    }

    @Override
    public void drive() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void sail() {
        throw new UnsupportedOperationException();
    }
}
