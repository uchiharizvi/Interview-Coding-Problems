package com.interview.coding.companies.fidelity.p002;

import java.util.*;

public class Problem002 {
    public static void main(String[] args) {
        String[] arr = {"Abc","Def","Abc", "18", "trfhgf"};
        PrintFrequency(Arrays.asList(arr));
    }

    private static void PrintFrequency(List<String> arr) {
        Map<String, Integer> frequency = new LinkedHashMap<>();
        for(String elem:arr){
            if(frequency.containsKey(elem)){
                frequency.put(elem,frequency.get(elem)+1);
            }else{
                frequency.put(elem, 1);
            }
        }
        for(Map.Entry<String, Integer> entry: frequency.entrySet()){
            System.out.println(entry.getKey() +  " " +entry.getValue());
        }
    }
}
