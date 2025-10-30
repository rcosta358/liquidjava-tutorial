package com.tutorial.part1;

import liquidjava.specification.Refinement;

@SuppressWarnings("unused")
public class ExampleRefinements {

    public static void main(String[] args) {
        @Refinement("positive > 0")
        int positive = 1;

        @Refinement("nonzero != 0")
        int nonzero = 2;

        @Refinement("0 <= _ && _ <= 100")
        int percentage = 50;
    }
}
