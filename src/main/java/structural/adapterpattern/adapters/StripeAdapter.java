package structural.adapterpattern.adapters;

import structural.adapterpattern.adaptees.StripeSDK;
import structural.adapterpattern.utility.PaymentRequest;

public class StripeAdapter implements IPaymentAdapter {

    StripeSDK stripeSDK;

    public StripeAdapter(StripeSDK stripeSDK) {
        this.stripeSDK = stripeSDK;
    }

    @Override
    public void processPayment(PaymentRequest paymentRequest) {
        this.stripeSDK.takeOrderPayment(paymentRequest.getAmount());
    }

}
