package com.interview.coding.companies.societegenerale.p002;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Use Java 8 Stream to print as single string
 **/
public class Question002 {
    public static void main(String[] args) {
        List<String> animals = Arrays.asList("tiger", "dog", "cat");
        String delimiter = "-";
        //Using Join()
        String result = String.join(delimiter, animals);
        System.out.println(result);
        //Using Stream()
        String result2 = animals.stream()
                                .map(Object::toString)
                                .collect(Collectors.joining(delimiter));
        System.out.println(result2);
        //String[] result = animals.stream().flatMap(Stream::of).toArray(String[]::new);//Convert to array
        //Arrays.stream(result).forEach(System.out::println);
    }
}
