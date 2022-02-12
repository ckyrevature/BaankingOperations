package domain;

public class SavingAccount extends Accounts{

    private double balance;
    private int accountNumber;
    private int routingNumber;


    public SavingAccount() {
    }

    public SavingAccount(String mailingAddress, double balance, int accountNumber, int routingNumber) {
        super(mailingAddress);
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.routingNumber = routingNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(int routingNumber) {
        this.routingNumber = routingNumber;
    }
}
