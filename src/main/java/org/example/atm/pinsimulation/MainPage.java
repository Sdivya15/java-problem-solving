package org.example.atm.pinsimulation;

import java.util.Scanner;

public class MainPage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pin;
        while(true){
            System.out.println("Enter a 4-digit pin: ");
            pin = sc.nextLine();

            if (!pin.matches("\\d{4}")) {
                System.out.println("Wrong pin");

            }
            else {
                System.out.println("Success");
                MenuPage.showMenu();//calling static method from another class
                break;
            }
        }
    }

}
