package org.example.switchstatements;

import java.util.Scanner;

//A simple Java-based console calculator that performs basic arithmetic operations using user input.
public class Calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first operand: ");
        int firstOperand = input.nextInt();
        System.out.println("Enter second operand: ");
        int secondOperand = input.nextInt();
        System.out.println("Enter the operation: ");
        String operation = input.next();
        int result ;

        switch(operation){
            case "+" -> { result = firstOperand + secondOperand;
                System.out.println("result = " + result);}

            case "-" -> { result = firstOperand - secondOperand;
                System.out.println("result = " + result);}

            case "*" -> { result = firstOperand * secondOperand;
                System.out.println("result = " + result);}

            case "/" -> {
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    System.out.println("result = " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
            }
            case "%" -> {
                if (secondOperand != 0) {
                    result = firstOperand % secondOperand;
                    System.out.println("result = " + result);
                } else {
                    System.out.println("Error: Cannot modulo by zero.");
                }
            }
            default -> System.out.println("Invalid");
        }
        input.close();
    }


}
