package com.interview.coding.companies.amazon.p002;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FindDiscount {
    static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (st.isEmpty()) {
                st.push(c);
            } else if (st.peek() == c) {
                st.pop();
            } else {
                st.push(c);
            }
        }
        return st.isEmpty();
    }
    public static List<Integer> isValidAsList(String s) {
        List<Integer> res =new ArrayList<>();
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
            } else if (stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }

        }
        if(stack.isEmpty()) res.add(1);
        else res.add(0);
        return res;
    }
}
