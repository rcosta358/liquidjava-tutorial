package com.tutorial.part3.exercise;

import liquidjava.specification.ExternalRefinementsFor;
import liquidjava.specification.Refinement;

@ExternalRefinementsFor("java.lang.Math")
public interface MathRefinements {
	
	@Refinement("_ == 3.141592653589793")
	public double PI = 0;
	
	@Refinement("_ == 2.7182818284590452354")
	public double E = 0;

    @Refinement("arg0 >= 0 ? _ == arg0 : _ == -arg0")
	public int abs(int arg0);

    @Refinement("true")
	public int max(int a, int b);

	@Refinement("true")
	public int min(int a, int b);
}