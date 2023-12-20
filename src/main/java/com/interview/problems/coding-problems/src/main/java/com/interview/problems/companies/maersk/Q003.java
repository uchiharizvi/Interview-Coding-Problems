package com.interview.coding.companies.maersk;

/*Given Arraylist of Integers from 1…10, find the missing number**/
public class Q003 {
    public static void main(String[] args) {
        int[] numbers = {10, 2, 7, 9, 6, 4, 5, 8, 1};
        int length = numbers.length;

        int i;
        int temp[] = new int[length + 1];//placeholder array of size numbers + 1
        for (i = 0; i <= length; i++) {
            temp[i] = 0;//initialize with 0 every element space in temp array
        }
        for (i = 0; i < length; i++) {
            temp[numbers[i] - 1] = 1;//Real Logic : Replace the values places with 1 in temp which are in numbers, so only missing will be 0
        }
        int ans = 0;
        for (i = 0; i <= length; i++) {
            if (temp[i] == 0) ans = i + 1;
        }
        System.out.println(ans);
    }
}
