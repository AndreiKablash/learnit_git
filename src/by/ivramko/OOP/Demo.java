package by.ivramko.OOP;

public class Demo {

    public static void main(String[] args) {
        Cart cart = new Cart();
        Cart.Tax tax = new Cart.Tax("someType", 0);
        Cart.Discount discount = cart.new Discount("someName", 0);

        Product product =new Product() {
            @Override
            public boolean isAvailableInStock() {
                return false;
            }
        };

    }
}
