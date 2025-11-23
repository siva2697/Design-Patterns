package structural.adapterpattern.utility;

public class PaymentRequest {

    String accountNumber;
    String walletId;
    double amount;


    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public String getWalletId() {
        return walletId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }
}
