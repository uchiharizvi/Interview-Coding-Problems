package com.interview.coding.companies.citiustech.p002;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;

/**Find 2nd Max using Streams**/
public class Problem001_b {
    public static void main(String[] args) {
        int[] numbers = {1,2,9,8,5,6,4,32,67,89};
        LocalTime startTime = LocalTime.now();
        System.out.println("StartTime : " + startTime);
        int secondLargestNumber = Arrays
                .stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .skip(1)
                .findFirst()
                .get();
        LocalTime endTime = LocalTime.now();
        System.out.println("EndTime : " + endTime);
        Duration duration = Duration.between(startTime,endTime);
        long differenceInNano = duration.getNano();
        System.out.println("\n Second Largest Number : " + secondLargestNumber);
        System.out.println("\n Execution Time : " + differenceInNano + "ns");

    }
}
