package com.interview.coding.companies.tsystems;

import java.util.HashSet;
import java.util.Set;

/**
 * array [10,2,-2,-20,10]. Find out number of sub-arrays whose submission is -10
 **/
public class Problem001 {
    public static void main(String[] args) {
        int[] input = {10, 2, -2, -20, 10};
        findSubArray(input);
    }

    private static void findSubArray(int[] input) {
        Set<Integer> hs = new HashSet<>();
        int sum = 0;
        for (int i : input) {
            sum += i;
            if (input[i] == 0 || sum == 0 || hs.contains(sum)) System.out.println("True");
            hs.add(sum);
        }
        System.out.println("False");
    }
}
