package com.interview.coding.companies.fidelity.p002;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Problem002_a {
    public static void main(String[] args) {
        String[] animals = {"dogs", "cats", "horses", "bee", "cats", "dogs", "cat", "ant", "bee"};
        checkFrequency(Arrays.asList(animals));
    }

    private static void checkFrequency(List<String> animals) {
        Map<String, Integer> frequency = new TreeMap<>();
        for (String animal : animals) {
            if (frequency.containsKey(animal)) frequency.put(animal, frequency.get(animal) + 1);
            else frequency.put(animal, 1);
        }
        for(Map.Entry<String, Integer> entry: frequency.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
