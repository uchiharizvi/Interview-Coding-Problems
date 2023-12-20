package com.interview.coding.companies.netcracker;

import java.util.Scanner;

/**
 * Write a Java Program to check Armstrong number
 **/
public class Question001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input : ");
        int input = scanner.nextInt();
        if (checkArmstrong(input)) System.out.println(input + " is Armstrong");
        else System.out.println(input + " is not an Armstrong");
    }

    private static boolean checkArmstrong(int input) {
        int originalNumber, remainder, result = 0, n = 0;
        originalNumber = input;
        for (; originalNumber != 0; originalNumber /= 10, ++n) ;
        originalNumber = input;
        for (; originalNumber != 0; originalNumber /= 10) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }
        return result == input;
    }
}

