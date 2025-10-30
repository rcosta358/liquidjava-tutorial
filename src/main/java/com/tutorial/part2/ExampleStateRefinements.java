package com.tutorial.part2;

import liquidjava.specification.StateRefinement;
import liquidjava.specification.StateSet;

@StateSet({"a", "b"})
public class ExampleStateRefinements {

    @StateRefinement(to="a(this)")
    public ExampleStateRefinements() {}

    @StateRefinement(from="a(this)", to="b(this)")
    public void toB() {}

    @StateRefinement(from="b(this)", to="a(this)")
    public void toA() {}

    public static void main(String[] args) {
        ExampleStateRefinements example = new ExampleStateRefinements();
        example.toB();
        example.toA();
        // example.toA(); // uncomment for error
    }
}
