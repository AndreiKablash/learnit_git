package by.ivramko.OOP.inheritance;

public class ObjectInitializationOrder {

    public static void main(String[] args) {
        Parent parent = new Child();
        System.out.println("____________________________-");
        parent = new Child();

    }


}

class Parent {


    static {
        System.out.println("static init in parent");
    }

    {
        System.out.println("init block parent");
    }

    public Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    static {
        System.out.println("static init in child");
    }

    {
        System.out.println("init block child");
    }

    public Child() {
        System.out.println("constructor in Child");
    }

}