package com.interview.coding.companies.amazon.p002;

public class Test {
    public static void main(String[] args) {
        FindDiscount discount = new FindDiscount();
        System.out.println(discount.isValid(""));
        System.out.println(discount.isValid("daabbd"));
        System.out.println(discount.isValid("abc"));

        //System.out.println(discount.isValidAsList(""));
        System.out.println(discount.isValidAsList("daabbd"));
        System.out.println(discount.isValidAsList("abc"));

        /*System.out.println(discount.isValid("xbbx"));
        System.out.println(discount.isValid("bbccdd"));
        System.out.println(discount.isValid("xyffyxdd"));

        System.out.println(discount.isValid("xyx"));
        System.out.println(discount.isValid("yx"));
        System.out.println(discount.isValid("y"));
        System.out.println(discount.isValid("xxxyyxx"));*/
    }
}
