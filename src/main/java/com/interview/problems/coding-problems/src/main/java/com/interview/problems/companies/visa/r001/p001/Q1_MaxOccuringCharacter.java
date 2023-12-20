package com.interview.coding.companies.visa.r001.p001;

import java.util.*;

public class Q1_MaxOccuringCharacter {
    static final int ASCII_SIZE = 256;
    public static void main(String[] args) {
        String input = "abbbaacc";
        System.out.println("Max occurring character is " + getMaxOccurringChar(input));
    }

    private static char getMaxOccurringChar(String input) {
        int count[] = new int[ASCII_SIZE];
        int len = input.length();
        for(int i=0;i<len;i++) count[input.charAt(i)]++;
        int max = -1;
        char result = ' ';

        for(int i=0;i<len;i++){
            if(max < count[input.charAt(i)]){
                max = count[input.charAt(i)];
                result = input.charAt(i);
            }
        }
        return result;
    }
}

