package org.example;

import java.util.Scanner;
//A beginner-friendly Java console program that uses Scanner and nested for loops to take user input
// and print multiplication tables from 1 up to N, demonstrating core loop concepts with clean logic.
public class NestedStatements {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the last table number: ");
        int n = input.nextInt();

        for (int table = 1; table <= n; table++) {
            System.out.println("\nTable of " + table);

            for (int i = 1; i <= 10; i++) {
                System.out.println(table + " x " + i + " = " + (table * i));
            }
        }
        input.close();
    }

}
