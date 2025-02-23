package com.interview.problems.domino;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int dominoCount = scanner.nextInt();
        List<Integer> domino = new ArrayList<>();
        for(int i=0;i<dominoCount;i++) {
            domino.add(scanner.nextInt());
        }
        int removeCount = scanner.nextInt();
        List<Integer> remove = new ArrayList<>();
        for(int i=0;i<removeCount;i++) {
            remove.add(scanner.nextInt());
        }
        int minOrder = scanner.nextInt();
        int result = Result.getMaxPoints(domino,remove,minOrder);
        System.out.println(result);
    }
}
