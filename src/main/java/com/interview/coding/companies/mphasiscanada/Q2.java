package com.interview.coding.companies.mphasiscanada;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q2 {
    /**
     * Q2)  String name = "My Name is Ahmed Kavish Rizvi";
     * Find First non repeating character
     **/
    public static void main(String[] args) {
        String name = "My Name is Tooba Mehmood";
        findNonRepeatingCharsStream(name);
        //findNonRepeatingChars(name);
    }

    static void findNonRepeatingCharsStream(String name) {
        Character result = name.chars()
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(result);
    }

    static void findNonRepeatingChars(String name) {
        List<Character> inDLL = new ArrayList<>();
        boolean[] repeated = new boolean[256];
        for (int i = 0; i < name.length(); i++) {
            char x = name.charAt(i);
            System.out.println("Reading " + x + " From Name \n");
            if (!repeated[x]) {
                if (!(inDLL.contains(x))) inDLL.add(x);
                else {
                    inDLL.remove((Character) x);
                    repeated[x] = true;
                }
            }
            if (inDLL.size() != 0) {
                System.out.println("First non-repeating character so far is ");
                System.out.println(inDLL.get(0));
            }
        }
    }
}
