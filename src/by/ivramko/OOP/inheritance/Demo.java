package by.ivramko.OOP.inheritance;

public class Demo {
    public static void main(String[] args) {
        Product product = new Phone();

        product.setName("Nokia 3110");
        System.out.println(product.getName());
        System.out.println(product.calculateRemainingAmount());

        Phone phone = null;
        if(product instanceof Phone){
            phone = (Phone)product;
            phone.ring();
        }
        System.out.println(phone.calculateAmountOfVariants());

    }
}
