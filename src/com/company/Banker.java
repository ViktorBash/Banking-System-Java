package com.company;

import java.util.Calendar;

public class Banker extends Person {
    // Banker class is made to do the transactions, simply inherits from person abstract class and has more
    // permissions than a client. Also does not have an account.
    public Banker(String fullName, String address, String SSN, String email, Calendar birthDate) {
        super(fullName, address, SSN, email, birthDate);
    }
}
