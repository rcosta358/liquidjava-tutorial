package com.tutorial.part5;

import liquidjava.specification.RefinementAlias;
import liquidjava.specification.StateSet;
import liquidjava.specification.Ghost;
import liquidjava.specification.StateRefinement;
import liquidjava.specification.Refinement;

@RefinementAlias("Percent(int x) { true }")
@StateSet({"waiting", "downloading", "finished"})
@Ghost("int progress")
public class Downloader {

    @StateRefinement(to="waiting(this)")
    public Downloader() {}

    @StateRefinement(from="true", to="true")
    public void start() {}

    @StateRefinement(from="true", to="true")
    @Refinement("true")
    public void updateProgress(@Refinement("true") int percentage) {}

    @StateRefinement(from="true", to="true")
    public void complete() {}

    @StateRefinement(from="true")
    public void getFile() {}

    public static void main(String[] args) {
        Downloader d = new Downloader();
        d.start();
        d.updateProgress(30);
        d.updateProgress(70);
        d.complete(); // should be an error
        d.getFile();
    }
}

