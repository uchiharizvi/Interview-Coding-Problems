package com.interview.coding.companies.tcs;

import java.util.Arrays;
import java.util.Scanner;
/**Inconsistent Solution - Improvement Required**/
public class Solution_Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Size of Array : ");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter element value of array[] : ");
        for(int i=0;i<n;i++) {
            System.out.println("Enter value for Element " + i);
            arr[i] = scan.nextInt();
        }
        Arrays.stream(arr).forEach(System.out::println);
        int len = arr.length;
        int res[] = new int[2];
        res[0] = arr[0];
        res[1] = arr[1];
        for (int i = 2; i < len; i++) {
            if (res[0] > arr[i]) {
                if (res[1] != 0 && res[1] > arr[i]) {
                    res[0] = res[1];
                    res[1] = arr[i];
                } else {
                    res[0] = arr[i];
                }
            }
        }
        System.out.println("Lowest Value : " + res[1]);
        System.out.println("2nd Lowest Value : " + res[0]);
    }
}
