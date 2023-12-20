package com.interview.coding.companies.tcs;

import java.util.Scanner;

public class Solution_Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        int len = a.length()-1;
        char[] c = a.toCharArray();
        reverse(c,len);
    }
    static void reverse(char[] c, int len){
        if(len ==0){
            System.out.print(c[len]);
            return;
        }
        System.out.print(c[len]);
        len--;
        reverse(c,len);
    }
}
