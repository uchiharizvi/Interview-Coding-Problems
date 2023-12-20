package com.interview.coding.companies.pwc;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Q2 {
    public static void main(String[] args) {
        Map<Employee, String> employeeMap = new HashMap<>();
        Employee emp1 = new Employee(1, "Anshul Jain","Apps");
        Employee emp2 = new Employee(2, "Anshul Jain","Accounts");
        employeeMap.put(emp1,"Active");
        employeeMap.put(emp2,"Resigned");
        System.out.println(employeeMap.get(emp1));
        System.out.println(employeeMap.get(emp2));
    }


}

class Employee {
    private final int empId;
    private final String employeeName;
    private final String department;

    public Employee(int empId, String employeeName, String department) {
        this.empId = empId;
        this.employeeName = employeeName;
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId && Objects.equals(employeeName, employee.employeeName) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, employeeName, department);
    }
}
