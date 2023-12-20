package com.interview.coding.companies.tsystems;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Given List of Employees, Print number of employees in each department
 **/
public class Problem002 {
    public static void main(String[] args) {

        Employee_002 emp1 = new Employee_002(1, "A", "Accounts");
        Employee_002 emp2 = new Employee_002(2, "B", "Accounts");
        Employee_002 emp3 = new Employee_002(3, "C", "Apps");
        Employee_002 emp4 = new Employee_002(4, "D", "Admin");
        Employee_002 emp5 = new Employee_002(5, "E", "Apps");

        List<Employee_002> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);

        //List All Employees
        System.out.println("All Employees : ");
        employees.forEach(System.out::println);
        //count number of Employees in each department
        System.out.println("Count of Employees by department:");

        Map<String, Long> byDept = employees.stream()
                .collect(Collectors
                        .groupingBy(Employee_002::getDepartment,
                                TreeMap::new, Collectors
                                        .counting()));
        byDept.forEach((department, count) -> System.out.printf("%s has %d employees(s)%n",department,count));


    }

}

class Employee_002 {
    private int id;
    private String name;
    private String department;

    public Employee_002(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee_002{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
