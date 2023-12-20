package com.interview.coding.practice.problems;

import java.util.Arrays;
import java.util.List;

public class StreamsProblem004 {
    /**Given the list of integers, find the first element of the list using Stream functions?**/
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,15,8,49,25,98,32,98,10);
        numbers.stream()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
