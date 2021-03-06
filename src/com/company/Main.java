package com.company;

import java.util.Calendar;

/**
 * @author Viktor Basharkevich
 * @version 1.0
 *
 * This is the main class which will interpret command line input and then carry
 * out those commands.
 *
 */


public class Main {

    public static void main(String[] args) {
        // This class tests the banking system by creating rob and bob, and then performing actions on them.

        // Creating a birth date (all bankers/clients will use this for now)
        Calendar bobBirthDate = Calendar.getInstance();
        bobBirthDate.set(Calendar.YEAR, 1988);
        bobBirthDate.set(Calendar.MONTH, Calendar.DECEMBER);
        bobBirthDate.set(Calendar.DAY_OF_MONTH, 29);

        // Creating the two test clients and test banker
        Client bob = new Client("Bob Rob", "Bikini Bottom", "12304340", "bob@bob.com", bobBirthDate);
        Client rob = new Client("Rob Bob[Fake]", "Krusty Krabs", "1234234234", "rob@rob.com", bobBirthDate);
        Banker banker = new Banker("Banker Lanker", "Rich Place", "123453534", "banker@bank.com", bobBirthDate);

        // Testing out actions on them
        bob.getAccount().transferTo(banker, rob, 100);
        rob.getAccount().subtractMoney(banker, 100);


    }


}
