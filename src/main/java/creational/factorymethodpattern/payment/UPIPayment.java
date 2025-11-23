package creational.factorymethodpattern.payment;

public class UPIPayment implements Payment {

    public final String vpa;
    public final String pin;

    public UPIPayment(String vpa, String pin) {
        this.pin = pin;
        this.vpa = vpa;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing payment of $ " + amount + " via " + vpa);
    }
}
