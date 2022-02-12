package domain;

public class CheckingAccount extends Accounts{

    private double balance;
    private int accountNumber;
    private int routingNumber;

    public CheckingAccount() {
    }

    public CheckingAccount(String mailingAddress, double balance, int accountNumber, int routingNumber) {
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

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", routingNumber=" + routingNumber +
                '}';
    }
}
