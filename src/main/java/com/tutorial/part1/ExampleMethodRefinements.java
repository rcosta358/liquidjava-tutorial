package com.tutorial.part1;

import liquidjava.specification.Refinement;

public class ExampleMethodRefinements {

    public static int divide(int a, @Refinement("b != 0") int b) {
        return a / b;
    }

    public static void main(String[] args) {
        int result = divide(6, 2);
        System.out.println(result);
    }
}
