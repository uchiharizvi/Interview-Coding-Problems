package com.interview.problems.RestAPI_DiscountedPrice;


import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int barcode = scanner.nextInt();
        int result = Result.getDiscountedPrice(barcode);
        System.out.println(result);
    }
}
