package com.interview.coding.companies.societegenerale.p001;

public class Question001 extends Test {
    void doTest() {
        System.out.println(calculate());
    }
}

 class Test {
    static int A = 2;
    static int B = 2;

    protected Integer calculate() {
        return A * B;
    }
}
