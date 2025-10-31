package com.tutorial.part1.exercise;

import liquidjava.specification.Refinement;

public class Bank {

    @Refinement("true")
    public static int deposit(@Refinement("true") int balance, @Refinement("true") int amount) {
        return balance + amount;
    }

    @Refinement("true")
    public static int withdraw(@Refinement("true") int balance, @Refinement("true") int amount) {
        return balance - amount;
    }
}