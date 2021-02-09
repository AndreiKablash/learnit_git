package by.ivramko.OOP.payment;

public class ChasePaymentProcessor implements PaymentProcessor, PaymentValidator {


    @Override
    public void processPayment(PaymentData payment) {

    }


    @Override
    public boolean validatePayment(PaymentData payment) {
        return false;
    }
}
