package com.interview.coding.companies.fidelity.p001;

import java.util.ArrayDeque;

public class Problem001 {
    public static void main(String[] args) {
        String input = "This is{ valid {}";
        int result = calculateValidPairs(input);
        System.out.println("Valid Pairs: " + result);
    }

    private static int calculateValidPairs(String input) {
        ArrayDeque<Character> stack = new ArrayDeque();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char x = input.charAt(i);
            if (x == '{') {
                stack.push(x);
                continue;
            }
            Character check;
            if (x == '}') {
                check = stack.pop();
                if (check == '{') {
                    count++;
                }
            }
        }
        return count;
    }
}
