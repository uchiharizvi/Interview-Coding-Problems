package com.interview.coding.companies.maersk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Given ArrayList of Strings, remove the duplicate values using Java 8**/
public class Q002 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names = Arrays.asList("ahmed","Kiran","ahmed");
        //remove duplicates from list
        names.stream().distinct().forEach(System.out::println);
    }
}
