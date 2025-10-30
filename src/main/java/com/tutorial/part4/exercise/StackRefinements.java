package com.tutorial.part4.exercise;

import liquidjava.specification.ExternalRefinementsFor;
import liquidjava.specification.Ghost;
import liquidjava.specification.StateRefinement;

@ExternalRefinementsFor("java.util.Stack")
@Ghost("int count")
public interface StackRefinements<E> {

	// constructor initializes count to 0 by default
	public void Stack();

	@StateRefinement(to="true")
	public boolean push(E elem);

	@StateRefinement(from="true", to="true")
	public E pop();

	@StateRefinement(from="true")
	public E peek();
}
