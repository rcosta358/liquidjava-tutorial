package com.tutorial.part1.exercise;

import liquidjava.specification.Refinement;

public class Counter {

    @Refinement("true")
    public static int increment(@Refinement("true") int count) {
        return count + 1;
    }

    @Refinement("true")
    public static int decrement(@Refinement("true") int count) {
        return count - 1;
    }

    public static void main(String[] args) {
        int c = 0;
        c = Counter.increment(c);
        c = Counter.decrement(c);
        c = Counter.decrement(c); // should be an error
        System.out.println(c);
    }
}
