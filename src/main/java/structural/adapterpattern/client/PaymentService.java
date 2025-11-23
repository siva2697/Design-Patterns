package structural.adapterpattern.client;

import structural.adapterpattern.adapters.IPaymentAdapter;
import structural.adapterpattern.utility.PaymentRequest;

public class PaymentService {

    IPaymentAdapter adapter;

    public PaymentService() {
    }

    public void processPayment(IPaymentAdapter adapter, PaymentRequest request) {
        adapter.processPayment(request);
    }

}
