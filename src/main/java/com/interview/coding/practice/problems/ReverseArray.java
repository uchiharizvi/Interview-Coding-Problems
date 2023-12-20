package com.interview.coding.practice.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /**Input Case 1**/
        System.out.println("Enter N: ");
        int n = scan.nextInt();
        System.out.println("Enter K: ");
        int k = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Values for Array : ");
        for (int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        ArrayList<Integer> values = new ArrayList<>();
        for (int elem : arr) values.add(elem);
        reverseInGroups(values, n, k);
    }

    static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        ArrayList<Integer> subArray = new ArrayList<>();
        if (k >= n) {
            subArray = reverseArray(arr, subArray, n, 0);
        }else {
            subArray = reverseArray(arr, subArray, k, 0);
            subArray = reverseArray(arr, subArray, n, k);
        }
        for(int i=0;i<arr.size();i++){
            System.out.print(subArray.get(i) + " ");
        }
    }

    private static ArrayList<Integer> reverseArray(ArrayList<Integer> arr, ArrayList<Integer> subArray, int k, int start) {
        for (int i = k - 1; i >= start; i--) {
            subArray.add(arr.get(i));
        }
        return subArray;
    }
}
