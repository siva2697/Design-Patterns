package creational.factorymethodpattern.payment;

public class CardPayment implements Payment {

    public final String cardNumber;
    public final String expiry;
    public final String cvv;
    public final String nameOnCard;

    public CardPayment(String cardNumber, String expiry, String cvv, String nameOnCard) {
        this.cardNumber = cardNumber;
        this.expiry = expiry;
        this.cvv = cvv;
        this.nameOnCard = nameOnCard;
    }

    private String getMaskedCard() {
        if(cardNumber == null || cardNumber.length() < 4) { return "****"; }
        return "****-****-****" + cardNumber.substring(cardNumber.length()-4);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing CARD payment of $" + amount + " using " + getMaskedCard());
    }
}
