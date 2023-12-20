package com.interview.coding.practice.problems;

import java.util.Arrays;
import java.util.List;

public class StreamsProblem002 {
    /**Given a list of integers, find out all the numbers starting with 1 using Stream functions?**/
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,15,8,49,25,98,32);
        numbers.stream()
                .map(s->s +"")//String Conversion
                .filter(s->s.startsWith("1"))
                .forEach(System.out::println);
    }
}
