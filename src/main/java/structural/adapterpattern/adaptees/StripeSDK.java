package structural.adapterpattern.adaptees;

public class StripeSDK {

    public void takeOrderPayment(double amount) {
        System.out.println("Stripe:::: Payment of $" + amount + " made successfully.");
    }

}
