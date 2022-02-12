package menu;


import java.util.Scanner;


public class Menu {
    Scanner scanner = new Scanner(System.in);

    /*
        User login and password
        1. Current Employee , 2. New Customer , 3. Employee
        using switch case
        At case 1 and 3 , what about the database can't found ?
        Custom exception? (UserCantFoundException?)

    */
    public void menu() {
        String userName, password;
        int accountType;
        do {
            System.out.println("--------------Welcome to XXXXX BANK--------------");
            System.out.println("Please select the following service");
            System.out.println("1. Existing customer , 2. Employee  3. Exit.");
            System.out.println("Please select the following service base on the number 1 to 3: ");
            int service = scanner.nextInt();
            try {
                switch (service) {
                    case 1:
                        System.out.println("--------------Customer Login--------------");
                        System.out.println("Username: ");
                        userName = scanner.nextLine();
                        System.out.println("Password: ");
                        password = scanner.nextLine();
                        /*
                        if the username and password match the database {
                        manageCustomerAccount();
                        }
                         */
                        break;
                    case 2:
                        System.out.println("--------------Employee Login--------------");
                        System.out.println("Username: ");
                        userName = scanner.nextLine();
                        System.out.println("Password: ");
                        password = scanner.nextLine();
                        /*
                        if the username and password match the database {
                        manageEmployeeAccount();
                        */
                        break;
                    case 3:
                        exit();
                        return;
                }
                //Custom Exception
            } catch (NumberIncorrectException e) {
                System.out.println("Number incorrect! Please select the following service: ");
                System.out.println("1. Existing customer , 2. Employee  3. Exit.");
            } catch (UserNotFoundException e) {
                System.out.println("Wrong username or password! Please double check again!");
                //Forget username or password method in the future
            }
        } while (true) ;
    }

    //case 1
    public void manageCustomerAccount(User user) {

    }




/* ------------No longer needed
    public void withdraw(Customer customer, double withdraw) {
        //base case
        double balance = customer.getBalance();
        if (balance == 0) {
            System.out.println("Your current balance is 0! Please double check");
        }

        if (withdraw > balance) {
            System.out.println("Your current balance " + balance + "is less than " + withdraw);
        }

        do {
            double currBalance = customer.getBalance() - withdraw;
            customer.setBalance(currBalance);
            System.out.println("Withdraw successfully! Your new balance is " + customer.getBalance());
            if (currBalance < 0) {
                System.out.println("You don't have enough balance! Please check again");
            }
            boolean flag = this.jungle();//user input for judge
            if (flag == false) {
                return;
            }
        } while (true);
    }

    public void deposit(Customer customer) {
        do {
            System.out.print("Please enter the Deposit number: ");
            double amount = scanner.nextDouble();

            //base case
            if (amount <= 0)
                System.out.println("The number you enter is " + amount + ". Please make sure the deposit number start at 1!");
            customer.setBalance(customer.getBalance() + amount);//set the amount and current balance at getBalance() into setBalance()
            System.out.println("Deposit successful , Your curr balance is " + customer.getBalance());
            boolean flag = this.jungle();//jungle to continue deposit or not
            if (flag == false) {
                return;
            }
        } while (true);
    }
    */


    //Verify the other party's account number and routing number
    //using account and routing number to transfer
    public void transfer(Customer customer) {
        do {
            System.out.println("Please enter the other party's account number");
            int accountNumber = scanner.nextInt();
            System.out.println("Please enter the other party's routing number");
            int routingNumber = scanner.nextInt();

            //base case
            if (accountNumber != customer.getAccountNumber() && routingNumber != customer.getRoutingNumber()) {
                System.out.println("The number were incorrect , Please double check again!");
            } else {
                //maybe I can display other party's number
                System.out.println("Please enter the amount you like to transfer to ");
                double amount = scanner.nextDouble();
                if (amount <= customer.getBalance()) {
                    customer.setBalance(customer.getBalance() - amount);
                    //maybe I can display other party's number
                    System.out.println("Success! Your current balance is " + customer.getBalance());
                } else {
                    System.out.println("Insufficient balance! Please double check");
                }
            }
            boolean flag = this.jungle();//jungle to continue deposit or not
            if (flag == false) {
                return;
            }
        } while (true);
    }


    //Simulation of everytime when we finish action , the ATM menu always ask go back to menu or finish using
    public boolean jungle() {
        System.out.println("\n Do you want to continue(y/n): ");
        char choice = scanner.next().charAt(0);
        choice = Character.toLowerCase(choice);
        if (choice == 'y') {
            return true;
        } else if (choice == 'n') {
            return false;
        } else {
            System.out.println("Input incorrect, please enter y as contain , n as leave!");
            // looping itself
            this.jungle();
        }
        return false;
    }

    public void exit() {
        System.out.println("\n Thank you for using XXXXX BANK , Good Bye!");
    }
}

