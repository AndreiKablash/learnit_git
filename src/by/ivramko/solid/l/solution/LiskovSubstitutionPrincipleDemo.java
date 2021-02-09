package by.ivramko.solid.l.solution;


public class LiskovSubstitutionPrincipleDemo {

    public static void main(String[] args) {
        Bird[] birds = {new Crow(), new Sparrow(), new Ostrich()};

        for (Bird b: birds
             ) {
            b.eat();
        }
    }
}
