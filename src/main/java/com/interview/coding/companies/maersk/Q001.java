package com.interview.coding.companies.maersk;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*Sort Employee based on Id (Use Stream)**/
public class Q001 {
    public static void main(String[] args) {
        List<Employee_maersk> employees = new ArrayList<>();
        employees.add(new Employee_maersk(5, "A"));
        employees.add(new Employee_maersk(1, "B"));
        employees.add(new Employee_maersk(4, "C"));
        employees.add(new Employee_maersk(3, "D"));
        employees.add(new Employee_maersk(2, "E"));

        System.out.println("All Employees : ");
        employees.forEach(System.out::println);

        employees.sort(Comparator.comparing(Employee_maersk::getId));
        System.out.println("Sorted Employees : ");
        employees.forEach(System.out::println);

    }
}

class Employee_maersk {
    private int id;
    private String name;

    public Employee_maersk(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{ id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
