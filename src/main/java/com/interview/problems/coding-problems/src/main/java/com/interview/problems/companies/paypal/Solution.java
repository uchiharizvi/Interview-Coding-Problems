package com.interview.coding.companies.paypal;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] line = scan.nextLine().split(" ");//Line from 0-10^9
        int n = Integer.parseInt(line[0]);
        int t = Integer.parseInt(line[1]);
        int[][] task = new int[n][2];
        for (int i_task = 0; i_task < n; i_task++) {
            String[] arr_task = scan.nextLine().split(" ");
            for (int j_task = 0; j_task < arr_task.length; j_task++) {
                task[i_task][j_task] = Integer.parseInt(arr_task[j_task]);
            }
        }
        int out_ = solve(n, t, task);
        System.out.println(out_);


    }

    private static int solve(int n, int t, int[][] task) {
        System.out.println("n : " + n);
        System.out.println("t : " + t);
        System.out.println("task-length :" + task.length);
        for (int i = 0; i < task.length; i++) {
            for (int j = 0; j < task.length; j++) {
                System.out.println("task " + "[" + i + "]" + "[" + j + "]" + ": " + task[i][j]);
            }
        }
        long sum = 0;
        int l = 31;
        while (l > 0) {
            sum = sum + (l % 10) * (l % 10);
            l = l / 10;
        }
        return 0;
    }
}
