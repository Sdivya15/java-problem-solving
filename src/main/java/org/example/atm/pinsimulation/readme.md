ATM PIN Simulation

Overview:
A console-based ATM simulation built with Java to demonstrate core OOP principles, input validation and financial calucaltions using BigDecimal.
The application allows users to authenticate using a 4- digit pin and perform basic banking operations.

Features:
1) Pin authentication with regex validation
2) check account balance
3) Deposit money 
4) Withdraw money(prevents overdraft)
5) Monetary precision using BigDecimal

Architecture:
MainPage -
Handles application startup and routes authenticated users to the ATM menu.
MenuPage - 
Manages user interaction after login and also processes transactions like balance check,deposit and Withdrawal by calling Account methods.
Account - 
Represents the bank account entity and encapsulated business logic.Maintain account state(pin,balance) and enforces validation for deposit and withdrawal operations.

