package by.ivramko.solid.i.solution;

public class InterfaceSegregationPrincipleDemo {

    public static void main(String[] args) {
        Flyable plane = new Plain();
        Drivable plane2 = new Plain();

        plane.fly();
        plane2.drive();

        Sailable vortex = new Vortex();
        if(vortex instanceof Drivable){
            ((Drivable) vortex).drive();
        }
    }
}
