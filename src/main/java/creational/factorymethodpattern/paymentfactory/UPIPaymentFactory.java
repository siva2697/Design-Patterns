package creational.factorymethodpattern.paymentfactory;

import creational.factorymethodpattern.payment.Payment;
import creational.factorymethodpattern.payment.UPIPayment;

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
