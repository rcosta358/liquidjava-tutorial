package com.tutorial.part3.exercise;

import liquidjava.specification.ExternalRefinementsFor;
import liquidjava.specification.StateRefinement;
import liquidjava.specification.StateSet;

@ExternalRefinementsFor("java.util.concurrent.locks.ReentrantLock")
@StateSet({"unlocked", "locked"})
public interface ReentrantLockRefinements {

    @StateRefinement(to="unlocked(this)")
    public void ReentrantLock();

    @StateRefinement(from="true", to="true")
    public void lock();

    @StateRefinement(from="true", to="true")
    public void unlock();
}