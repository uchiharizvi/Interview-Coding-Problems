package com.interview.coding.companies.visa.r002.p002;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        String input = "God Ding";
        //reverse(input);
        //reverse2(input);
        reverse3(input);


       /* String[] s1 = input.split(" ");//s1[God, ding]
        char[] c1;

        for(int i=0;i<s1.length;i++){
            c1 = s1[i].toCharArray();


        }

        System.out.println(c1);*/

    }

    private static void reverse3(String input) {
        String[] s1 = input.split(" ");
        Arrays.stream(s1).forEach(Q2::reverse);
    }

    private static void reverse2(String input) {
        char[] temp = input.toCharArray();
        int l, r = 0;
        r = temp.length - 1;
        for(l=0;l<r;l++,r--){
            char temp2 = temp[l];
            temp[l] = temp[r];
            temp[r] = temp2;
        }
        for(char c:temp) System.out.print(c);
    }

    private static void reverse(String input) {
        /**Approach 1 : Use String Builder**/
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(input);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
