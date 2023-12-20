package com.interview.coding.companies.mphasiscanada;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Q1) int[] arr1 = {1,6,7,8,6,8};
 * Using Streams print the first repeating character
 **/
public class Q1 {
    public static void main(String[] args) {
        Stream<Integer> stream
                = Stream.of(5, 13, 4,
                21, 13, 27,
                2, 59, 59, 34);

        // Print the found duplicate elements
        System.out.println(
                findDuplicateInStream(stream));
    }

    public static <T> Set<T> findDuplicateInStream(Stream<T> stream) {
        return stream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(m -> m.getValue() > 1)
                .map(Map.Entry::getKey).collect(Collectors.toSet());
    }
}
