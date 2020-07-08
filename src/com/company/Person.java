package com.company;

import java.util.Calendar;

abstract class Person {
    private final String fullName;
    private final String address;
    private final String SSN;
    private final String email;
    private final Calendar birthDate;

    public Person(String fullName, String address, String SSN, String email, Calendar birthDate) {
        this.fullName = fullName;
        this.address = address;
        this.SSN = SSN;
        this.email = email;
        this.birthDate = birthDate;
    }

    public void printInfo() {
        System.out.println(fullName + " lives in " + address);
    }

    public String getSSN() {
        return this.SSN;
    }


}
