package by.ivramko.OOP.staticKeyword;

import static java.util.Arrays.*;
public class Demo {


    public static void main(String[] args) {
        User user1 = new User();
        System.out.println("user1. id  = "+ user1.getId());
        System.out.println("user1. counter = "+ user1.getCounter());

        System.out.println();
        System.out.println("========================");
        System.out.println();

        User user2 = new User();
        System.out.println("user1. id  = "+ user2.getId());
        System.out.println("user. counter = "+ user2.getCounter());

        System.out.println();
        System.out.println("========================");
        System.out.println();

        System.out.println("user1. counter = "+ user1.getCounter());

        System.out.println();
        System.out.println("========================");
        System.out.println();

        User user3 = new Employer();
        user3.doAnyStaticAction();

        Employer.doAnyStaticAction();

        int[] arr = {1,1,2};
        sort(arr);
    }
}
