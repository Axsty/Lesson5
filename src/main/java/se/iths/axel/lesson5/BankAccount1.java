package se.iths.axel.lesson5;

import java.util.Scanner;

public class BankAccount1 {

    Scanner scanner = new Scanner(System.in);

    // Class variables
    double accountNumber;
    double balance;

    // Constructor
    public BankAccount1(double accountNumber, double balance) {

        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double balance) {

    }

    public void printInfo() {
        System.out.println("You balance is: " + balance + " kr");
    }

}
