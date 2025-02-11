package com.interview.problems.substringSearch;

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int result = Result.findSubstring(s);
        System.out.println(String.valueOf(result));
    }
}
