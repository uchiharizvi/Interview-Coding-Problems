package com.interview.problems.account_management;

public interface Account {
    void deposit(double amount);

    void withdraw(double amount);

    double getBalance();

    String getAccountHolder();

    int getAccountNumber();

    double calculateInterest();
}
