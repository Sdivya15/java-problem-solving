package org.example.TaxCalculator;
import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double salary = input.nextDouble();

        if (salary < 0) {
            System.out.println("Enter valid salary.");
            return;
        }
        double tax = 0;
        double remainingIncome = salary;
        if (remainingIncome > 100000){
            tax += (remainingIncome - 100000) * 0.30;
            remainingIncome = 100000;
        }
        if (remainingIncome > 60000){
            tax += (remainingIncome - 60000) * 0.20;
            remainingIncome = 60000;
        }
        if (remainingIncome > 30000){
            tax += (remainingIncome - 30000) * 0.10;
        }

        System.out.printf("Total Tax: $%.2f\n", tax);
        input.close();


    }
}
