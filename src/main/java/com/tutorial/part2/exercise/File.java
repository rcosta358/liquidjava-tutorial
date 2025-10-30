package com.tutorial.part2.exercise;

import liquidjava.specification.StateRefinement;
import liquidjava.specification.StateSet;

@StateSet({"open", "closed"})
public class File {

    @StateRefinement(to="closed(this)")
    public File() {}
    
    @StateRefinement(from="true", to="true")
    public void open() {}

    @StateRefinement(from="true")
    public void read() {}

    @StateRefinement(from="true", to="true")
    public void close() {}
}
