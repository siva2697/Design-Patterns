package structural.adapterpattern.adapters;

import structural.adapterpattern.adaptees.PayPalSDK;
import structural.adapterpattern.utility.PaymentRequest;

public class PayPalAdapter implements IPaymentAdapter {

    PayPalSDK payPalSDK;

    public PayPalAdapter(PayPalSDK payPalSDK) {
        this.payPalSDK = payPalSDK;
    }

    @Override
    public void processPayment(PaymentRequest paymentRequest) {
        payPalSDK.chargeAmount(paymentRequest.getWalletId(), paymentRequest.getAmount());
    }
}
