package com.interview.problems.account_management;

public class CheckingAccount extends AbstractAccount {

    public CheckingAccount(String accountHolder) {
        super(accountHolder);
    }

    @Override
    public double calculateInterest() {
        return 0.0; // Checking accounts don't earn interest
    }
}
