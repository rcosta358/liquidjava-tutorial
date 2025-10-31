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

    public static void main(String[] args) {;
        int b = 0;
        b = Bank.deposit(b, 10);
        b = Bank.withdraw(b, 20); // should be an error
        System.out.println(b);
    }
}