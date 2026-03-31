package com.gla.classesandobjects.classesandobjectslevel2;

public class BankAccount { String accountHolder;
    int accountNumber;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.accountHolder = "Dinesh";
        acc.accountNumber = 12345;
        acc.balance = 1000;

        acc.deposit(500);
        acc.withdraw(300);
        acc.displayBalance();
    }
}
