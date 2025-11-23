package structural.adapterpattern.adapters;

import structural.adapterpattern.adaptees.RazorPaySDK;
import structural.adapterpattern.utility.PaymentRequest;

public class RazorPayAdapter implements IPaymentAdapter {

    RazorPaySDK razorPaySDK;

    public RazorPayAdapter(RazorPaySDK razorPaySDK) {
        this.razorPaySDK = razorPaySDK;
    }

    @Override
    public void processPayment(PaymentRequest paymentRequest) {
        this.razorPaySDK.makePayment(paymentRequest.getAccountNumber(), paymentRequest.getAmount());
    }
}
