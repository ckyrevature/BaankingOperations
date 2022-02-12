package domain;

public class Accounts {
    private String mailingAddress;

    public Accounts() {
    }

    public Accounts(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    @Override
    public String toString() {
        return "Accounts{" +
                "mailingAddress='" + mailingAddress + '\'' +
                '}';
    }
}
