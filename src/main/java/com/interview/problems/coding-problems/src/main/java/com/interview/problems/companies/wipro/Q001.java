package com.interview.coding.companies.wipro;

import java.util.HashMap;
public class Q001 {
    public static void main(String[] args) {
        String s1 = "I am living in Bangalore";
        char[] arr = s1.toCharArray();
        HashMap<Character, Integer> frequency = new HashMap<>();
        for(char elem:arr) {
            if (!frequency.containsKey(elem)) {
                frequency.put(elem, 1);
            } else {
                frequency.put(elem, frequency.get(elem) + 1);
            }
        }
        System.out.println(frequency);
    }
    /**Convert to Java 8*/
}
