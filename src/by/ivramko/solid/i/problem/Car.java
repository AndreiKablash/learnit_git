package by.ivramko.solid.i.problem;

public class Car implements Vehicle {

    @Override
    public void fly() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void drive() {
        System.out.println("Car drive");
    }

    @Override
    public void sail() {
        throw new UnsupportedOperationException();
    }
}
