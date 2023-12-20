package com.interview.coding.companies.sapient.p001;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Sort Employee List by Max Salary in each department
 **/
public class Solution {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "ABC", 45000, "Acc");
        Employee employee2 = new Employee(2, "XYZ", 25000, "Acc");
        Employee employee3 = new Employee(3, "Ran", 90000, "Apps");
        Employee employee4 = new Employee(4, "Dom", 54300, "Business");
        Employee employee5 = new Employee(5, "Cruc", 8000, "Non Tech");
        Employee employee6 = new Employee(5, "ABC", 9000, "Non Tech");
        List<Employee> employees = new ArrayList<>();
        employees.add(employee);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        System.out.println("All Employees :");
        employees.forEach(Employee::print);
        /**Sorting on Salary and grouping by dept**/
        Map<String, List<Employee>> deptWiseSort = employees.stream()
                .sorted(Comparator.comparing(o -> o.getName()))
                .collect(Collectors.groupingBy(Employee::getDept));
        System.out.println("DeptWiseGrouping : ");
        for (String department : deptWiseSort.keySet())
            System.out.println(department + ": " + deptWiseSort.get(department));

        /*for (Map.Entry entry : deptWiseSort.entrySet()) {
            System.out.println("Department " + entry.getKey() + ", Employee = " + entry.getKey(key));
        }*/

        /**Sorting on Salary**/
        List<Employee> sal = employees.stream().sorted(Comparator.comparingInt(o -> o.getSalary())).collect(Collectors.toList());
        System.out.println("SalarySort : ");
        sal.forEach(Employee::print);
        /**Sorting on Name**/
        List<Employee> names = employees.stream().sorted(Comparator.comparing(o -> o.getName())).collect(Collectors.toList());
        System.out.println("NameSort : ");
        names.forEach(Employee::print);
        /**Sorting alternate code**/
        //employees.sort(Comparator.comparingInt(o->o.getSalary()));


    }

}
