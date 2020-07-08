package com.company;

public class Account {
    public double balance;
    private Client holder;

    public Account(Client holder) {
        this.balance = 0;
        this.holder = holder;
    }

    public void addMoney(Object accessor, double amount) {
        if (accessor instanceof Banker) {
            this.balance += amount;
        }
    }

    public void subtractMoney(Object accessor, double amount) {
        if (accessor instanceof Banker) {
            this.balance -= amount;
        }
    }

    public void transferTo(Object accessor, Client person2, double amount) {
        if (accessor instanceof Banker) {
//            this.getAccount().subtractMoney(accessor, amount);
            this.balance -= amount;
            person2.getAccount().addMoney(accessor, amount);
        }
    }


}
