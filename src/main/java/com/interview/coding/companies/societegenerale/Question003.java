package com.interview.coding.companies.societegenerale;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Compare both list and return only distinct values
 **/
public class Question003 {
    public static void main(String[] args) {
        List<String> animalsI = Arrays.asList("dog","cat","wolf","monkey");
        List<String> animalsII = Arrays.asList("donkey","horse","wolf");
        List<String> distinctAnimals = new ArrayList<>(animalsI);
        List<String> commonAnimals = new ArrayList<>(animalsI);
        commonAnimals.retainAll(animalsII);//common elements
        distinctAnimals.removeAll(animalsII);
        System.out.println("Unique Animals : ");
        distinctAnimals.stream().distinct().forEach(System.out::println);

        System.out.println("Common Animals : ");
        commonAnimals.stream().distinct().forEach(System.out::println);
    }
}
