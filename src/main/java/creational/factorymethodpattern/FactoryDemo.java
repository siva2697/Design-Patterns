package creational.factorymethodpattern;

import creational.factorymethodpattern.client.Checkout;
import creational.factorymethodpattern.paymentfactory.CardPaymentFactory;
import creational.factorymethodpattern.paymentfactory.PaymentFactory;
import creational.factorymethodpattern.paymentfactory.UPIPaymentFactory;

public class FactoryDemo {
    public static void main(String[] args) {

        Checkout checkout = new Checkout();

        PaymentFactory cardFactory = new CardPaymentFactory(
                "298712347878",
                "12/28",
                "817",
                "Veera Bhogya Vasantha Raya"
        );

        checkout.payForOrder(cardFactory, 2025.0);


        PaymentFactory upiPaymentFactory = new UPIPaymentFactory(
                "vbvr@ybl",
                "2222"
        );

        checkout.payForOrder(upiPaymentFactory, 2025.0);

    }
}
