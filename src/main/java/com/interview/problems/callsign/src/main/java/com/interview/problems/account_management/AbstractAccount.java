package com.interview.problems.account_management;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class AbstractAccount implements Account {
    private static final AtomicInteger accountNumberGenerator = new AtomicInteger(1);

    protected int accountNumber;
    protected String accountHolder;
    protected double balance;

    public AbstractAccount(String accountHolder) {
        this.accountNumber = accountNumberGenerator.getAndIncrement();
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}
