package com.interview.problems.domino;

import java.util.*;

public class Result {

    public static int getMaxPoints(List<Integer> domino, List<Integer> remove, int minOrder) {
        int n = domino.size();
        TreeSet<Integer> indices = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            indices.add(i);
        }
        List<Integer> lis = new ArrayList<>();
        for (int i : indices) updateLIS(lis, domino.get(i));

        if (lis.size() < minOrder) return 0;

        for (int moves = 0; moves < n; moves++) {
            indices.remove(remove.get(moves));
            if (!isValidLIS(domino, indices, minOrder)) return moves;
        }
        return n;

    }

    private static boolean isValidLIS(List<Integer> domino, TreeSet<Integer> indices, int minOrder) {
        List<Integer> lis = new ArrayList<>();
        for (int i : indices) updateLIS(lis, domino.get(i));
        return lis.size() >= minOrder;
    }

    private static void updateLIS(List<Integer> lis, int value) {
        int pos = Collections.binarySearch(lis, value);
        if (pos < 0) pos = -(pos + 1);
        if (pos < lis.size()) lis.set(pos, value);
        else lis.add(value);
    }
}
