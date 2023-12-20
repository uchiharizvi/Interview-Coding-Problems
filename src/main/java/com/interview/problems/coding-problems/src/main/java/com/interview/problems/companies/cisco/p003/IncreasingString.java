package com.interview.coding.companies.cisco.p003;

import java.util.Scanner;

public class IncreasingString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer N = 0;
        Integer K = 0;
        String S = "";
        //Input Test Case
        Integer T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            //Number of String
            N = scan.nextInt();
            //Number 1 -26(a-1,b-2,c-3,..,z-26)
            K = scan.nextInt();
        }
        for (int i = 0; i < N; i++) {
            S = scan.nextLine();
        }
    }


}
