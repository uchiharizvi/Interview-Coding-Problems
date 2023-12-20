package com.interview.coding.companies.ubs.p002;

public class Q10 {
    static String str;

    public Q10() {
        System.out.println("In Constructor");
        str = "Hello World";
    }
    public static void main(String[] args) {
        Q10 obj = new Q10();
        System.out.println(str);
    }
}
