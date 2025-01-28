package com.interview.problems.account_management;

import java.util.HashMap;
import java.util.Map;

public class BankingSystem {
    private Map<Integer, Account> accounts;

    public BankingSystem() {
        accounts = new HashMap<>();
    }

    public void createAccount(String accountType, String accountHolder, double... params) {
        Account account = null;

        switch (accountType.toLowerCase()) {
            case "checking":
                account = new CheckingAccount(accountHolder);
                break;
            case "savings":
                account = new SavingsAccount(accountHolder, params[0]);
                break;
            case "credit_card":
                account = new CreditCardAccount(accountHolder, params[0], params[1]);
                break;
            default:
                System.out.println("Invalid account type.");
                return;
        }

        accounts.put(account.getAccountNumber(), account);
    }

    public void deposit(int accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(int accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public double checkBalance(int accountNumber) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            return account.getBalance();
        } else {
            System.out.println("Account not found.");
            return -1;
        }
    }

    public void makePayment(int accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account instanceof CreditCardAccount) {
            ((CreditCardAccount) account).deposit(amount); // Make payment by depositing
        } else {
            System.out.println("Account is not a credit card account.");
        }
    }

    public double calculateInterest(int accountNumber) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            return account.calculateInterest();
        } else {
            System.out.println("Account not found.");
            return -1;
        }
    }
}
