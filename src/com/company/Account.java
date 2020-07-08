package com.company;

import java.text.NumberFormat;

public class Account {
    public double balance;
    private Client holder;
    private NumberFormat currency = NumberFormat.getCurrencyInstance();


    public Account(Client holder) {
        this.balance = 0;
        this.holder = holder;
    }

    public void addMoney(Object accessor, double amount) {
        if (accessor instanceof Banker) {
            this.balance += amount;
            String result = currency.format(amount);
            System.out.println("Successfully added " + result + " for " + holder.getFirstName());
            printBalance();
        }
        else {
            permissionDenied();
        }
    }

    public void subtractMoney(Object accessor, double amount) {
        if (accessor instanceof Banker) {
            this.balance -= amount;
            String result = currency.format(amount);
            System.out.println("Successfully subtracted " + result + " from " + holder.getFirstName());
            printBalance();
        }
        else {
            permissionDenied();
        }
    }

    public void transferTo(Object accessor, Client person2, double amount) {
        if (accessor instanceof Banker) {
            subtractMoney(accessor, amount);
            person2.getAccount().addMoney(accessor, amount);
        }
        else {
            permissionDenied();
        }
    }

    public void printBalance() {
        String result = currency.format(this.balance);
        System.out.println("Total Balance for " + holder.getFirstName() + " :" + result);
    }

    public void permissionDenied() {
        System.out.println("You do not have permission to do this action.");
    }


}
