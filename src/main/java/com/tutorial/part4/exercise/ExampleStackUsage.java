package com.tutorial.part4.exercise;

import java.util.Stack;

public class ExampleStackUsage {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.peek();
        stack.pop();
        stack.pop(); // should be an error
    }
}
