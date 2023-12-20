package com.interview.coding.companies.ubs.p003;

public class Q12 {
    public static void main(String[] args) {
        try{
            badMethod();
            System.out.println("A");
        }catch (Exception ex){
            System.out.println("B");
        }finally {
            System.out.println("C");
        }
        System.out.println("D");
    }
    public static void badMethod(){}
}
