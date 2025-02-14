package com.banktransaction;

// Custom Exception for Insufficient Balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// BankAccount Class
class BankAccount {
    private double balance;

    // Constructor to initialize balance
    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative!");
        }
        this.balance = initialBalance;
        System.out.println("Current balance: " + balance);
    }

    // Method to withdraw an amount
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount! Amount cannot be negative.");
        } else if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful, new balance: " + balance);
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}

// Main Class
public class BankAccountSystem {
    public static void main(String[] args) {
        try {
            // Initialize a BankAccount with an initial balance
            BankAccount account = new BankAccount(1000);

            // Attempt a withdrawal
            System.out.println("Attempting to withdraw 500...");
            account.withdraw(500);

            // Attempt a withdrawal with insufficient funds
            System.out.println("Attempting to withdraw 600...");
            account.withdraw(600);

            // Attempt a withdrawal with a negative amount
            System.out.println("Attempting to withdraw -100...");
            account.withdraw(-100);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}

