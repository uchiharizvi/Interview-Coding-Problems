package com.interview.coding.practice.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Find Sum of all Even numbers in an Integer List using Streams
 **/
public class Problem001 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(9);
        numbers.add(8);
        numbers.add(7);
        numbers.add(6);
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);

        Problem001 object = new Problem001();
        object.useReduce(numbers);
        object.useReduceMethodReference(numbers);
        object.useReduceCustomMethod(numbers);
        object.useCollect(numbers);
        object.useMapToInt(numbers);


    }

    private void useMapToInt(List<Integer> numbers) {
        Integer sum = numbers.stream().filter(x->x%2==0)
                        .mapToInt(Integer::intValue)
                                .sum();
        System.out.println(sum);
    }

    private void useCollect(List<Integer> numbers) {
        Integer sum = numbers.stream().filter(x->x%2==0)
                .collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sum);
    }

    private void useReduceCustomMethod(List<Integer> numbers) {
        Integer sum = numbers.stream()
                .filter(x -> x % 2 == 0)
                .reduce(0, Problem001::add);
        System.out.println(sum);
    }

    private static Integer add(Integer a, Integer b) {
        return a + b;
    }

    private void useReduceMethodReference(List<Integer> numbers) {
        Integer sum = numbers.stream()
                .filter(x -> x % 2 == 0)
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }

    /**
     * Using Reduce()
     **/
    private void useReduce(List<Integer> numbers) {
        Integer sum = numbers.stream()
                .filter(x -> x % 2 == 0)
                .reduce(0, (a, b) -> (a + b));
        System.out.println(sum);
    }
}
