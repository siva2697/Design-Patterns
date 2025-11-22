package creational.factory;

import creational.factory.client.Checkout;
import creational.factory.paymentfactory.CardPaymentFactory;
import creational.factory.paymentfactory.PaymentFactory;
import creational.factory.paymentfactory.UPIPaymentFactory;

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
