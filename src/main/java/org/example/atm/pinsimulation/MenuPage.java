package org.example.atm.pinsimulation;

import java.math.BigDecimal;
import java.util.Scanner;

public class MenuPage {


    public static void showMenu(Account person,Scanner sc) {


        while (true) {
            System.out.println("Welcome to ATM Menu");
            System.out.println("Select an option");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4.Exit");


            if (!sc.hasNextInt()) {
                System.out.println("Invalid input");
                sc.next();
                continue;
            }

            int choice = sc.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("Current Balance: " + person.getBalance());
                    break;


                case 2:
                    System.out.println("Enter withdrawal amount");
                    BigDecimal withdraw = new BigDecimal(sc.next());
                    if (person.withdraw(withdraw)) {
                        System.out.println("Please collect your cash");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;
                case 3:
                    System.out.println("Enter deposit amount");
                    BigDecimal deposit = new BigDecimal(sc.next());
                    person.deposit(deposit);
                    System.out.println("Amount deposited successfully");
                    break;


                case 4:
                    System.out.println("Thank you");
                    return;


                default:
                    System.out.println("Invalid choice");
            }


        }
    }
}
