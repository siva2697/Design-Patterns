package structural.adapterpattern;

import structural.adapterpattern.adaptees.PayPalSDK;
import structural.adapterpattern.adaptees.RazorPaySDK;
import structural.adapterpattern.adaptees.StripeSDK;
import structural.adapterpattern.adapters.IPaymentAdapter;
import structural.adapterpattern.adapters.PayPalAdapter;
import structural.adapterpattern.adapters.RazorPayAdapter;
import structural.adapterpattern.adapters.StripeAdapter;
import structural.adapterpattern.client.PaymentService;
import structural.adapterpattern.utility.PaymentRequest;

public class AdapterDemo {

    public static void main(String[] args) {


        PaymentService service = new PaymentService();

        IPaymentAdapter paypalAdapter = new PayPalAdapter(new PayPalSDK());

        PaymentRequest request1 = new PaymentRequest();
        request1.setAmount(1111.1);
        request1.setWalletId("paypal_user_1234");

        // Process payment through PayPal
        service.processPayment(paypalAdapter, request1);



        IPaymentAdapter razorpayAdapter = new RazorPayAdapter(new RazorPaySDK());

        PaymentRequest request2 = new PaymentRequest();
        request2.setAccountNumber("razorpay_user_7821");
        request2.setAmount(2222.2);

        // Process payment through RazorPay
        service.processPayment(razorpayAdapter, request2);

        IPaymentAdapter stripeAdapter = new StripeAdapter(new StripeSDK());
        PaymentRequest request3 = new PaymentRequest();
        request3.setAccountNumber("stripe_user_9981");
        request3.setAmount(3333.3);

        // Process payment through Stripe
        service.processPayment(stripeAdapter, request3);

    }
}
