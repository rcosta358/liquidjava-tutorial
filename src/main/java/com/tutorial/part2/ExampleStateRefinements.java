package com.tutorial.part2;

import liquidjava.specification.StateRefinement;
import liquidjava.specification.StateSet;

@StateSet({"a", "b"})
public class ExampleStateRefinements {

    @StateRefinement(to="a(this)")
    public ExampleStateRefinements() {}

    @StateRefinement(from="a(this)", to="b(this)")
    public void a() {}

    @StateRefinement(from="b(this)", to="a(this)")
    public void b() {}

    public static void main(String[] args) {
        ExampleStateRefinements example = new ExampleStateRefinements();
        example.a();
        example.b();
        // example.b(); // uncomment for error
    }
}
