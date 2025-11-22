package creational.factory.paymentfactory;

import creational.factory.payment.Payment;
import creational.factory.payment.UPIPayment;

public class UPIPaymentFactory extends PaymentFactory {

    private final String vpa;
    private final String pin;

    public UPIPaymentFactory(String vpa, String pin) {
        this.vpa = vpa;
        this.pin = pin;
    }

    @Override
    protected Payment createPayment() {
        return new UPIPayment(vpa, pin);
    }
}
