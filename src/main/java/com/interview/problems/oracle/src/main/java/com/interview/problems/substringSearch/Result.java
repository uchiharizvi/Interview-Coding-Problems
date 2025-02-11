package com.interview.problems.substringSearch;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class Result {
    public static int findSubstring(String s) {
        int n = s.length();
        return IntStream.range(0, n)
                .map(i -> {
                    Set<Character> uniqueChars = new HashSet<>();
                    return (int) IntStream.range(i, n)
                            .takeWhile(j -> uniqueChars.add(s.charAt(j)))
                            .count();
                })
                .sum();
    }
}
