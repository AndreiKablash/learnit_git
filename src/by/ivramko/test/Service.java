package by.ivramko.test;

import java.util.Arrays;
import java.util.Objects;

public class Service {

    private Order[] orders;

    {
        orders = new Order[]{null, new Order(1, "name1")};
    }

    public Order[] getOrdersById(int userId) {
        return Arrays.stream(orders)
                .filter(Objects::nonNull)
                .filter(order -> order.getId()==userId)
                .toArray(Order[]::new);
    }

    public boolean isEmpty(Order[] orders){
        return Arrays.stream(orders).allMatch(Objects::isNull);
    }
}
