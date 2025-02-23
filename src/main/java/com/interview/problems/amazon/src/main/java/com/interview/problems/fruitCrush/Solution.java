package com.interview.problems.fruitCrush;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int fruitsCount = scanner.nextInt();
        List<Integer> fruits = new ArrayList<>();
        for(int i=0;i<fruitsCount;i++) {
            fruits.add(scanner.nextInt());
        }
        int result = Result.getMinFruits(fruits);
        System.out.println(result);
    }
}
