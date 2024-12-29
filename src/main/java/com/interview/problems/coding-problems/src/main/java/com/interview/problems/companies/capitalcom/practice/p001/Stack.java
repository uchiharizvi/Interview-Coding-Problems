package com.interview.problems.companies.capitalcom.practice.p001;

import java.util.ArrayList;

public class Stack {
    private ArrayList<Integer> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    public void push(int x) {
        stack.add(x);
    }

    public Integer pop() {
        if(!isEmpty()) {
            return stack.remove(stack.size() -1);//or use removeLast() Java 21
        }else {
            return null; //stack underflow
        }
    }

    public Integer peek() {
        if (!isEmpty()) {
            return stack.get(stack.size()-1);//or use getLast() Java 21
        } else {
            return null; // stack underflow
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
