package com.interview.coding.practice.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StreamsProblem003 {
    /**How to find duplicate elements in a given integers list in java using Stream functions?**/
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,15,8,49,25,98,32,98,10);
        Set<Integer> uniqueNumbers = new HashSet<>();
        numbers.stream()
                .filter(n->!uniqueNumbers.add(n))
                .forEach(System.out::println);
    }
}
