package creational.factorymethodpattern.paymentfactory;

import creational.factorymethodpattern.payment.Payment;

public abstract class PaymentFactory {

    protected abstract Payment createPayment();

    public void processPayment(double amount) {
        Payment payment = createPayment();
        payment.pay(amount);
    }
}
