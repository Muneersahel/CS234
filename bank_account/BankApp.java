package bank_account;

/**********************************************************************************
 * this program is created to explore classes and object in java as object oriented 
 * programming. 
 * Coppy the codes, paste to your favorite editor and compile to see the output.
 * Follow the comments to see and explore different functionality of codes.
 **********************************************************************************/

import java.util.Scanner;

public class BankApp {

    private String AccountName;
    private double balance;

    // a constructor is used to initialize instance variables, this constructor has
    // parameters.
    public BankApp(String AccountName, double balance) {
        this.AccountName = AccountName;
        this.balance = balance;
    }

    // main method is where the application program is found, our program starts to
    // run here
    // for all other method to execute, they must be called within the main method
    public static void main(String[] args) {
        double amount;
        int operation;
        int account;
        int choice;

        // creating an object that enable input of values from the keyboard.
        Scanner input = new Scanner(System.in);

        // create class object (accounts) to have access to class methods.
        BankApp acc1 = new BankApp("Account Number One", 500); // here we pass argument to the constructor
                                                               // of the class BankApp
        BankApp acc2 = new BankApp("Account Number Two", 1600); // here we also pass arguments to the
                                                                // constructor of the class BankApp.
        do {
            System.out.println("Please select account name : ");
            System.out.print("1." + acc1.AccountName + ".\n2." + acc2.AccountName + "\n");
            if (!input.hasNextInt()) {
                System.err.println("Wrong choice.\nTHANK YOU! WELCOME AGAIN!!");
                input.close();
                return;
            }

            account = input.nextInt();

            // making decisions based on the user's input
            switch (account) {
                case 1:
                    System.out.println("Current Balance : " + acc1.balance);
                    System.out.println("Select operation :");
                    System.out.print("1. Deposit.\n2. Withdraw.\n");
                    if (!input.hasNextInt()) {
                        System.err.println("Wrong choice.\nTHANK YOU! WELCOME AGAIN!!");
                        return;
                    }
                    operation = input.nextInt();
                    switch (operation) {
                        case 1:
                            System.out.println("Enter amount :");
                            if (!input.hasNextDouble()) {
                                System.err.println("Wrong entry.\nTHANK YOU! WELCOME AGAIN!!");
                                return;
                            }
                            amount = input.nextDouble();
                            acc1.deposit(amount);
                            break; // ending case 1
                        case 2:
                            System.out.println("Enter amount :");
                            if (!input.hasNextDouble()) {
                                System.err.println("Wrong entry.\nTHANK YOU! WELCOME AGAIN!!");
                                return;
                            }
                            amount = input.nextDouble();
                            acc1.withdraw(amount);
                            break; // ending case 2

                    }
                    break; // ending case 1
                case 2:
                    System.out.println("Current Balance : " + acc2.balance);
                    System.out.println("Select operation :");
                    System.out.print("1. Deposit.\n2. Withdraw.\n");
                    if (!input.hasNextInt()) {
                        System.err.println("Wrong choice.\nTHANK YOU! WELCOME AGAIN!!");
                        return;
                    }
                    operation = input.nextInt();
                    switch (operation) {
                        case 1:
                            System.out.println("Enter amount :");
                            if (!input.hasNextDouble()) {
                                System.err.println("Wrong entry.\nTHANK YOU! WELCOME AGAIN!!");
                                return;
                            }
                            amount = input.nextDouble();
                            acc2.deposit(amount);
                            break; // ending case 1
                        case 2:
                            System.out.println("Enter amount :");
                            if (!input.hasNextDouble()) {
                                System.err.println("Wrong entry\nTHANK YOU! WELCOME AGAIN!!");
                                return;
                            }
                            amount = input.nextDouble();
                            acc2.withdraw(amount);
                            break; // ending case 2

                    }
                    break; // ending case 2
            }

            System.out.print("Do you want to continue ?.\n1. Y\n2. N\n");
            if (!input.hasNextInt()) {
                System.err.println("Wrong choice.\nTHANK YOU! WELCOME AGAIN!!");
                input.close();
                return;
            }
            choice = input.nextInt();
            System.out.println();
            if (choice == 2) {
                System.out.println("Thank you for visiting. Bye!!!");
            }
        } while (choice == 1);
        input.close();

    }

    // method to deposit amount
    private void deposit(double amount) {
        this.balance += amount; // this add to the initial balance value
        // message to a user
        System.out.println("New Balanceinput : " + balance);
    }

    // method to withdraw cash
    private void withdraw(double amount) {
        if (balance <= amount) {
            System.out.println("Withdrawal failure, INSUFFICIENT FUND");
        } else {
            this.balance -= amount; // this decreases the cash withdrawn from the balance
            System.out.println("WITHDRAWAL SUCCESSFULLY");
            System.out.println("New Balance : " + balance);
        }
    }
}
