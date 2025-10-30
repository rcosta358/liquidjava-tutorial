package com.tutorial.part1.exercise;

import liquidjava.specification.Refinement;

public class ExampleBankRefinements {

    @Refinement("true")
    public static int deposit(@Refinement("true") int balance, @Refinement("true") int amount) {
        return balance + amount;
    }

    @Refinement("true")
    public static int withdraw(@Refinement("true") int balance, @Refinement("true") int amount) {
        return balance - amount;
    }

    public static void main(String[] args) {
        int balance = 0;
        balance = deposit(balance, 10);
        balance = withdraw(balance, 20); // should be an error
        System.out.println(balance);
    }
}
