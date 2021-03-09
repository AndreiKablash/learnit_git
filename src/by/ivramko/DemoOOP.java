package by.ivramko;


import org.w3c.dom.ls.LSOutput;

class Vehicle{

    private String drive() { return "Driving vehicle"; }
}

class Car extends Vehicle{

    protected  String drive() { return "Driving car"; }
}

public class DemoOOP  extends  Car{
    public String drive() { return "Driving electric Car"; }
    public static void main(String[] args) {
        final Car car = new DemoOOP();
        System.out.println(car.drive());

        System.out.println("added some functionality");
    }




}
