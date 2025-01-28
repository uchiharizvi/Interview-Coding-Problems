package com.interview.problems.account_management;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankingSystem bankingSystem = new BankingSystem();

        int m = Integer.parseInt(sc.nextLine()); // Number of accounts to create
        for (int i = 0; i < m; i++) {
            String[] accountInfo = sc.nextLine().split(",");
            String accountType = accountInfo[0];
            String accountHolder = accountInfo[1];

            if (accountType.equals("savings")) {
                double interestRate = Double.parseDouble(accountInfo[2]);
                bankingSystem.createAccount(accountType, accountHolder, interestRate);
            } else if (accountType.equals("credit_card")) {
                double creditLimit = Double.parseDouble(accountInfo[2]);
                double interestRate = Double.parseDouble(accountInfo[3]);
                bankingSystem.createAccount(accountType, accountHolder, creditLimit, interestRate);
            } else {
                bankingSystem.createAccount(accountType, accountHolder);
            }
        }

        int k = Integer.parseInt(sc.nextLine()); // Number of operations
        for (int i = 0; i < k; i++) {
            String[] operation = sc.nextLine().split(",");
            String command = operation[0];

            switch (command) {
                case "deposit":
                    int depositAcc = Integer.parseInt(operation[1]);
                    double depositAmount = Double.parseDouble(operation[2]);
                    bankingSystem.deposit(depositAcc, depositAmount);
                    break;
                case "withdraw":
                    int withdrawAcc = Integer.parseInt(operation[1]);
                    double withdrawAmount = Double.parseDouble(operation[2]);
                    bankingSystem.withdraw(withdrawAcc, withdrawAmount);
                    break;
                case "checkBalance":
                    int checkAcc = Integer.parseInt(operation[1]);
                    System.out.println("Current Balance of this account is " + bankingSystem.checkBalance(checkAcc));
                    break;
                case "makePayment":
                    int paymentAcc = Integer.parseInt(operation[1]);
                    double paymentAmount = Double.parseDouble(operation[2]);
                    bankingSystem.makePayment(paymentAcc, paymentAmount);
                    break;
                case "calculateInterest":
                    int interestAcc = Integer.parseInt(operation[1]);
                    System.out.println("Interest earned: " + bankingSystem.calculateInterest(interestAcc));
                    break;
                default:
                    System.out.println("Unknown operation.");
            }
        }

        sc.close();
    }
}
