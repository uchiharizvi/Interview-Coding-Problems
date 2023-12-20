package com.interview.coding.companies.maersk;

import Maersk.functionalinterfaces.Cube;
import Maersk.functionalinterfaces.Square;

/*Write a custom Functional Interface**/
public class Q004 {
    public static void main(String[] args) {
        Square square = (a) -> System.out.println(a * a);
        Cube cube = (a) -> System.out.println(a * a * a);
        square.calculate(5);
        cube.calculate(3);
    }
}
