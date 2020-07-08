package com.company;

import java.util.Calendar;

abstract class Person {
    private String fullName;
    private String address;
    private String SSN;
    private String email;
    private Calendar birthDate;
    private String firstName;
    private String lastName;

    public Person(String fullName, String address, String SSN, String email, Calendar birthDate) {
        this.fullName = fullName;
        this.address = address;
        this.SSN = SSN;
        this.email = email;
        this.birthDate = birthDate;

        String[] nameArr = fullName.split(" ");
        this.firstName = nameArr[0];
        this.lastName = nameArr[1];

    }

    public void printInfo() {
        System.out.println(fullName + " lives in " + address);
    }

    public String getSSN() {
        return this.SSN;
    }

    public String getAddress() {
        return this.address;
    }

    public String getEmail() {
        return this.email;
    }

    public Calendar getBirthDate() {
        return this.birthDate;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }


}
