package com.pluralsight.finance;

public class CreditCard implements Valuable{
    // Properties
    private String name;
    private String accountNumber;
    private double balance;

    // Constructor
    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Methods
    @Override
    public double getValue() {
        return this.balance;
    }

    public void charge(double amount) {
        this.balance += amount;
    }

    public void pay(double amount) {
        this.balance -= amount;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
