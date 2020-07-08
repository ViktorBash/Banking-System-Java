package com.company;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
	Calendar bobBirthDate = Calendar.getInstance();
	bobBirthDate.set(Calendar.YEAR, 1988);
	bobBirthDate.set(Calendar.MONTH, Calendar.DECEMBER);
	bobBirthDate.set(Calendar.DAY_OF_MONTH, 29);

    Client bob = new Client("Bob", "Bikini Bottom", "12304340", "bob@bob.com", bobBirthDate);
    bob.printInfo();
        System.out.println(bob.getSSN());

    }
}
