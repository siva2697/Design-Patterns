package structural.adapterpattern.adaptees;

public class PayPalSDK {

    public void chargeAmount(String walletID, double amount) {
        System.out.println("PayPal:::: Charging amount " + amount + " to wallet ID: " + walletID);
    }

}
