package structural.adapterpattern.adapters;

import structural.adapterpattern.utility.PaymentRequest;

public interface IPaymentAdapter {
    void processPayment(PaymentRequest paymentRequest);
}
