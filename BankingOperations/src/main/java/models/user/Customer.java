package domain;

public class Customer extends User{
        //customerID maybe will useful in SQL
        private int customerID;
        private double balance;
        private int accountNumber;
        private int routingNumber;



        public Customer() {
        }

        public Customer(int customerID, double balance, int accountNumber, int routingNumber) {
                super();
                this.customerID = customerID;
                this.balance = balance;
                this.accountNumber = accountNumber;
                this.routingNumber = routingNumber;
        }

        public int getCustomerID() {
                return customerID;
        }

        public void setCustomerID(int customerID) {
                this.customerID = customerID;
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
                return "Customer{" +
                        "customerID=" + customerID +
                        ", balance=" + balance +
                        ", accountNumber=" + accountNumber +
                        ", routingNumber=" + routingNumber +
                        '}';
        }
}
