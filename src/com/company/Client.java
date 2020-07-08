package com.company;

import java.util.Calendar;

public class Client extends Person {
    private Account account;

    // Create client using super() to use constructor from person class
    public Client(String fullName, String address, String SSN, String email, Calendar birthDate) {
        super(fullName, address, SSN, email, birthDate);
        createAccount();
    }

    // Runs on instantiation, creates a linked bank account class
    private void createAccount() {
        Account account = new Account(this);
        this.account = account;
    }

    // getter to get the account
    public Account getAccount() {
        return this.account;
    }



}
