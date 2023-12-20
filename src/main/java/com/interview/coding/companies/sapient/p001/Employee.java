package com.interview.coding.companies.sapient.p001;

public class Employee {

    private int id;
    private String name;
    private int salary;
    private String dept;

    public Employee(int id, String name, int salary, String dept) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getDept() {
        return dept;
    }

    public void print() {
        System.out.println("Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                '}');
    }
}
