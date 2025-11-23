package creational.factorymethodpattern.client;

import creational.factorymethodpattern.paymentfactory.PaymentFactory;

public class Checkout {

    /*
    * The Checkout is client here
    * It doesn't need to know what the underlying Concrete class is (i.e:CardPayment, UPIPayment)
    * It doesn't need to worry about how to initialize those concrete classes
    * It relies on PaymentFactory to deal with the above.
    *
    * */
    public void payForOrder(PaymentFactory paymentFactory, double amount) {
        System.out.println("Checkout started");
        paymentFactory.processPayment(amount);
        System.out.println("Checkout done successfully");
    }

}
