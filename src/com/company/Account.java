package com.company;

import java.text.NumberFormat;

public class Account {
    // The logic and business code is in the account class

    public double balance;
    private final Client holder;
    private NumberFormat currency = NumberFormat.getCurrencyInstance();

    // Create account and link a client to it
    public Account(Client holder) {
        this.balance = 0;
        this.holder = holder;
    }

    // display information about the account
    public void displayAccount() {
        String result = currency.format(this.balance);
        System.out.println("Account Owner: " + holder.getFullName() + " . Balance: " + result);
    }

    // Add money with the credentials of a banker being passed in as the first parameter
    public void addMoney(Object accessor, double amount) {
        if (accessor instanceof Banker) {
            this.balance += amount;
            String result = currency.format(amount);
            System.out.println("Successfully added " + result + " for " + holder.getFullName());
            printBalance();
        }
        else {
            permissionDenied();
        }
    }

    // Subtract money with the credentials of a banker being passed in as the first parameter
    public void subtractMoney(Object accessor, double amount) {
        if (accessor instanceof Banker) {
            this.balance -= amount;
            String result = currency.format(amount);
            System.out.println("Successfully subtracted " + result + " from " + holder.getFullName());
            printBalance();
        }
        else {
            permissionDenied();
        }
    }

    // Transfer money with the credentials of the banker, the client to send money to, and the amount
    public void transferTo(Object accessor, Client person2, double amount) {
        if (accessor instanceof Banker) {
            subtractMoney(accessor, amount);
            person2.getAccount().addMoney(accessor, amount);
        }
        else {
            permissionDenied();
        }
    }

    // Prints balance for account
    private void printBalance() {
        String result = currency.format(this.balance);
        System.out.println("Total Balance for " + holder.getFullName() + " :" + result);
    }

    // Simple method which is called whenever the person trying to do a transaction is not a banker
    private void permissionDenied() {
        System.out.println("You do not have permission to do this action.");
    }


}
