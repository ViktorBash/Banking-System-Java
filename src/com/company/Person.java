package com.company;

import java.util.Calendar;

abstract class Person {
    // This is the abstract class for a person which will be the inherited in the Banker and Client classes

    private String fullName;
    private String address;
    private String SSN;
    private String email;
    private Calendar birthDate;
    private String firstName;
    private String lastName;

    // Creating person and adding their various attributes
    public Person(String fullName, String address, String SSN, String email, Calendar birthDate) {
        this.fullName = fullName;
        this.address = address;
        this.SSN = SSN;
        this.email = email;
        this.birthDate = birthDate;

        // Take the full name and split it to get store the first name and last name
        String[] nameArr = fullName.split(" ");
        this.firstName = nameArr[0];
        this.lastName = nameArr[1];

    }

    // All of these methods below are getters to return various properties

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
