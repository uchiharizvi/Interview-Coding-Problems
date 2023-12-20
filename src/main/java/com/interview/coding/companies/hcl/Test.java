package com.interview.coding.companies.hcl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        /*List<Employee> employees = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();
        nums.add(90);
        nums.add(45);
        employees.stream().filter(e->e.getAge()>20).map(a->a.getName()).collect(Collectors.toList());
        nums.stream().sorted().collect(Collectors.toList());
        System.out.println(nums);*/
        String a = "NITIN";
        int j=0;
        char[] arr = new char[5];
        char[] arr2 = new char[5];
        arr = a.toCharArray();
        for(int i=arr.length-1;i>=0;i--){
            //ascii value;
            arr2[j] = arr[i];
            j++;
        }

        if(arr2.equals(arr)){
            System.out.println("true");
        }else System.out.println("False");


    }
    //age > 20, emp name


}
