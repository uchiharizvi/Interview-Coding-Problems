package com.interview.problems.companies.maersk;


/*Write a custom Functional Interface**/
public class Q004 {
    public static void main(String[] args) {
        com.interview.coding.companies.maersk.Square square = (a) -> System.out.println(a * a);
        com.interview.coding.companies.maersk.Cube cube = (a) -> System.out.println(a * a * a);
        square.calculate(5);
        cube.calculate(3);
    }
}
