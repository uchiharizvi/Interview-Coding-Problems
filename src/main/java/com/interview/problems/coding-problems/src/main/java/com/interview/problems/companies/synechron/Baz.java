package com.interview.coding.companies.synechron;

public class Baz {
    public static void main(String[] args) {
        Foo f = new Foo();
        //System.out.println(""+f.a); //compile time issue - trying to access default from outside package
        //System.out.println(""+f.b); // compile time issue - trying to access protected from outside package
        System.out.println(""+f.c);
    }
}
