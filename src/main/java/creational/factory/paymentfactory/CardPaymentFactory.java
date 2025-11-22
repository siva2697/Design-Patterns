package creational.factory.paymentfactory;

import creational.factory.payment.CardPayment;
import creational.factory.payment.Payment;

public class CardPaymentFactory extends PaymentFactory {

    private final String cardNumber;
    private final String expiry;
    private final String cvv;
    private final String nameOnCard;

    public CardPaymentFactory(String cardNumber, String expiry, String cvv, String nameOnCard) {
        this.cardNumber = cardNumber;
        this.expiry = expiry;
        this.cvv = cvv;
        this.nameOnCard = nameOnCard;
    }

    @Override
    protected Payment createPayment() {
        return new CardPayment(cardNumber, expiry, cvv, nameOnCard);
    }
}
