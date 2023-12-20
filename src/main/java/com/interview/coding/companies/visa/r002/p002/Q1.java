package com.interview.coding.companies.visa.r002.p002;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q1 {
    /**
     * Find sum of all Even nos in Stream
     **/
    public static void main(String[] args) {
        /*List<Integer> values = new ArrayList<>();
        int[] arr = {1,6,7,8,5,4,6,7,2};
        for(int val:arr) values.add(val);*/
        List<Integer> val = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

        /**Use Reduce**/
        Integer sum = val.stream().filter(x -> x % 2 == 0)
                .reduce(0, (a, b) -> (a + b));
        Integer sum2 = val.stream().filter(x -> x % 2 == 0)
                .reduce(0, Integer::sum);
        Integer sum3 = val.stream().filter(x -> x % 2 == 0)
                .reduce(0, Q1::add);
        /**Using Collect**/
        Integer sum4 = val.stream().filter(x -> x % 2 == 0)
                .collect(Collectors.summingInt(Integer::intValue));
        /**Using intStream**/
        Integer sum5 = val.stream().filter(x -> x % 2 == 0)
                .mapToInt(Integer::intValue)
                        .sum();
        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);
        System.out.println(sum5);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
