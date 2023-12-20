package com.interview.coding.practice.problems;

import java.util.Arrays;
import java.util.List;

public class StreamsProblem006 {
    /**Given a list of integers, find the total number of elements present in the list using Stream functions?**/
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,15,8,49,25,98,32,98,10);
        long count = numbers.stream().count();
        System.out.println(count);
    }
}
