package by.ivramko.test;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Service service = new Service();
        Order[] orders = service.getOrdersById(2);
        if(orders==null){
            System.out.println("no orders");
        }else {
            if(service.isEmpty(orders)){
                System.out.println("orders is empty");
            }else {
                System.out.println(Arrays.toString(orders));
            }

        }
        System.out.println("HELLO");

    }
}
