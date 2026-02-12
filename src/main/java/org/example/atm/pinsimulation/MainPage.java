package org.example.atm.pinsimulation;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class MainPage {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();


        accounts.add(new Account("1234", new BigDecimal("5000")));
        accounts.add(new Account("1111", new BigDecimal("10000")));
        accounts.add(new Account("2222", new BigDecimal("7500")));


        while (true) {
            System.out.println("Enter a 4-digit pin: ");
            String enteredPin = sc.nextLine();


            if (!enteredPin.matches("\\d{4}")) {
                System.out.println("Invalid pin format");
                continue;
            }
            Account loggedInAccount = null;


            for (Account account : accounts) {
                if (account.getPin().equals(enteredPin)) {
                    loggedInAccount = account;
                    break;
                }
            }
            if (loggedInAccount != null) {
                System.out.println("Login Successful");
                MenuPage.showMenu(loggedInAccount,sc);
                break;
            }
            else{
                System.out.println("Incorrect pin ");
            }


        }
    }
}
