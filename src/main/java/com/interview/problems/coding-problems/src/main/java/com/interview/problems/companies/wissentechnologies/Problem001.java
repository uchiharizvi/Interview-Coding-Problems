package com.interview.coding.companies.wissentechnologies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
/**Farthest from zero**/
public class Problem001 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter printWriter = new PrintWriter(System.out);
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int[] a = new int[n];
        String[] inp = bufferedReader.readLine().split(" ");
        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(inp[i]);
        }
        int out_ = solve(n,a);
        System.out.println(out_);
        printWriter.close();
        bufferedReader.close();
    }

    private static int solve(int n, int[] a) {

        return -1;
    }
}
