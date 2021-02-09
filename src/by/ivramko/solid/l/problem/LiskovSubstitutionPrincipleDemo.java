package by.ivramko.solid.l.problem;

public class LiskovSubstitutionPrincipleDemo {

    public static void main(String[] args) {
        Bird[] birds = {new Crow(), new Sparrow(), new Ostrich()};

        for (Bird b: birds
             ) {
            b.fly();
        }

    }
}
