package se.iths.axel.lesson5.BankAccount;

import java.util.Scanner;

public class BankAccount {

    Scanner scanner = new Scanner(System.in);


    // Class variables
    String accountNumber;
    int balance;


    // Constructor
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public BankAccount() {

    }

    // Getter
    public int getBalance() {
        return balance;
    }

    // Methods
    public void depositAmount() {
        System.out.print("Enter the amount you want to deposit?: ");
        int amountAdded = scanner.nextInt();
        this.balance = amountAdded;
        scanner.nextLine();
        System.out.println("You have: " + this.balance + " €" + " in your account");

    }

    public void withdrawAmount() {
        System.out.println("Do you want to exit the bank, or do you want to withdraw? Enter (exit/withdraw): ");
        String answer = scanner.nextLine();
        if (answer.equals("exit")) {
            System.out.println("Have a good day!");
            
        } else {
            System.out.println("Enter the amount you want to withdraw: ");
            int amountWithdraw = scanner.nextInt();
            scanner.nextLine();
            int totalAmount = this.balance - amountWithdraw;
            System.out.println("You have: " + totalAmount + " €" + " in your bank account");
        }
    }
}
