package com.company;

import java.util.Calendar;

public class Client extends Person {
    private Account account;

    public Client(String fullName, String address, String SSN, String email, Calendar birthDate) {
        super(fullName, address, SSN, email, birthDate);
        createAccount();
    }

    private void createAccount() {
        Account account = new Account(this);
        this.account = account;
    }

    public Account getAccount() {
        return this.account;
    }



}
