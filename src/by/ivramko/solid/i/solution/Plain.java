package by.ivramko.solid.i.solution;

public class Plain implements Flyable, Drivable{

    @Override
    public void fly() {
        System.out.println("Plain flies");
    }

    @Override
    public void drive() {
        System.out.println("Plain drives");
    }
}
