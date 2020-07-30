package bank_account;

import java.util.Scanner;

public class BankAccount {
    String accountName;
    double balance;

    public BankAccount(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }

    public static void main(String[] args) {
        int choice;

        Scanner input = new Scanner(System.in);

        BankAccount acc1 = new BankAccount("Amani, Jacob", 5000);
        BankAccount acc2 = new BankAccount("Said, Munir", 2000);

        System.out.println("WELCOME TO ANZAMANI BANK SYSTEM.");
        System.out.println("Choose your account.\n1.Amani, Jacob.\n2.Said, Munir.");
        if (!input.hasNextInt()) {
            System.err.println("Wrong choice. Welcome again.");
            input.close();
            return;
        }

        choice = input.nextInt();

        if (choice == 1) {
            acc1.account(acc1.accountName, acc1.balance);
        } else if (choice == 2) {
            acc2.account(acc2.accountName, acc2.balance);
        }

        input.close();

    }

    public void account(String name, Double balance) {
        int operation;
        double amount;
        Scanner input = new Scanner(System.in);
        System.out.println("Your accout name is " + name + " Your balance is " + balance);
        System.out.println("1.Deposit.\n2.Withdraw.");
        if (!input.hasNextInt()) {
            System.err.println("Wrong choice. Welcome again");
            input.close();
            return;
        }
        operation = input.nextInt();
        switch (operation) {
            case 1:
                System.out.println("Enter amount to deposit: ");
                if (!input.hasNextDouble()) {
                    System.err.println("Wrong entry.");
                }
                amount = input.nextDouble();
                balance += amount;
                System.out.println("New balance is " + balance + ".\n SUCCESSFULL");
                break;

            case 2:
                System.out.print("Enter amount to withdraw: ");
                if (!input.hasNextDouble()) {
                    System.err.println("Wrong entry. Welcome again");
                    input.close();
                    return;
                }
                amount = input.nextDouble();
                if (amount > balance) {
                    System.err.println("UNSUFFICIENT FUND.");
                } else {
                    balance -= amount;
                    System.out.println("Your new balance is " + balance + ". SUCCESSFUL");
                }
        }
        input.close();
    }
}
