package structural.adapterpattern.adaptees;

public class RazorPaySDK {

    public void makePayment(String accountNo, double amount) {
        System.out.println("RazorPay:::: Payment of $ " + amount + " made from account no " + accountNo);
    }

}
