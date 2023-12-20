package com.interview.coding.companies.synechron;

import java.util.Optional;

public class Man {
    public static void main(String[] args) {
        Optional<String> fullName = Optional.of("Tom");
        fullName=Optional.ofNullable(null);
        fullName.orElseGet(()->"[None]");
        System.out.println(fullName.map(
                s->"Hey" + s+"!")
                .orElse("Hey Tommy!"));
    }

}
