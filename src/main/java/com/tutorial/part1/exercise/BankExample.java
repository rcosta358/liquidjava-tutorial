package com.tutorial.part1.exercise;

public class BankExample {

    public static void main(String[] args) {;
        int b = 0;
        b = Bank.deposit(b, 10);
        b = Bank.withdraw(b, 20); // should be an error
        System.out.println(b);
    }
}
