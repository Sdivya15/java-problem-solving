package org.example.atm.pinsimulation;
import java.math.BigDecimal;


public class Account {


    private String  pin;
    private BigDecimal balance;


    public Account(String  pin, BigDecimal balance) {
        this.pin = pin;
        this.balance = balance;
    }


    public String  getPin() {
        return pin;
    }


    public BigDecimal getBalance() {
        return balance;
    }


    //Deposit
    public void deposit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) > 0) {
            balance = balance.add(amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    //Withdraw
    public boolean withdraw(BigDecimal amount){
        // balance = balance.subtract(amount);
        if(amount.compareTo(BigDecimal.ZERO)>0 && amount.compareTo(balance)<=0){
            balance = balance.subtract(amount);
            return true;
        }
        return false;
    }


}
