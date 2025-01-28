package com.interview.problems.account_management;

public class CreditCardAccount extends AbstractAccount {
    private double creditLimit;
    private double interestRate;

    public CreditCardAccount(String accountHolder, double creditLimit, double interestRate) {
        super(accountHolder);
        this.creditLimit = creditLimit;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        if (balance > creditLimit) {
            balance = creditLimit; // Prevent balance from exceeding credit limit
        }
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }
}
