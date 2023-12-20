package com.interview.coding.companies.coforge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Using streams print frequency of each value in an array
 **/
public class Problem001 {
    public static void main(String[] args) {
        Integer arrInt[] = {1, 2, 1, 3, 2, 4};
        Map<Integer, Long> frequencyMap = Arrays.stream(arrInt)
                .collect(Collectors.groupingBy(Function.identity(),
                        HashMap::new,
                        Collectors.counting()));
        System.out.println(frequencyMap);
    }
}
