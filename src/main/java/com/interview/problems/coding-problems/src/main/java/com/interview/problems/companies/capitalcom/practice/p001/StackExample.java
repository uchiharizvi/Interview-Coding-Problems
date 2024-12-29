package com.interview.problems.companies.capitalcom.practice.p001;

public class StackExample {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        System.out.println("Top Element : " + myStack.peek());
        System.out.println("Pop : " + myStack.pop());
        System.out.println("Top Element : " + myStack.peek());
        System.out.println("Is Stack Empty : " + myStack.isEmpty());
        System.out.println("Pop : " + myStack.pop());
        System.out.println("Top Element : " + myStack.peek());
        System.out.println("Pop : " + myStack.pop());
        System.out.println("Is Stack Empty : " + myStack.isEmpty());
    }
}
