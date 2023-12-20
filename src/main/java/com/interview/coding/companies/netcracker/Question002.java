package com.interview.coding.companies.netcracker;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * From a given array of natural numbers, return the distance between the two closest numbers.
 **/
public class Question002 {
    public static void main(String[] args) {
        int[] numbers = {3, 9, 50, 15, 99, 7, 98, 65};
        IntStream sortedNumbers = Arrays.stream(numbers).sorted();
        calculateDistance(sortedNumbers);
    }

    private static void calculateDistance(IntStream sortedNumbers) {
        int[] distances = new int[1];
    }

}

