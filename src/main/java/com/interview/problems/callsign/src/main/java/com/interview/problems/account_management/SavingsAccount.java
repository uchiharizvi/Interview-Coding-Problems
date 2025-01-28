package com.interview.problems.account_management;

public class SavingsAccount extends AbstractAccount {
    private double interestRate;

    public SavingsAccount(String accountHolder, double interestRate) {
        super(accountHolder);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate; // Simple interest calculation
    }
}
