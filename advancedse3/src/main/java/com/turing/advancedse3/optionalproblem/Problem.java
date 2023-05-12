package com.turing.advancedse3.optionalproblem;

import java.util.Optional;

public class Problem {
	public static void main(String[]args)
	{
		Optional<Integer> some = Optional.empty();
		Optional<Integer> another= some.map((x)->x+1);
		
		System.out.println("Another "+another.orElse(0));
	}
}
