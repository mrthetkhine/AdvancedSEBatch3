package com.turing.advancedse3.designpattern.strategy;

public class MergedSort implements SortStrategy{

	@Override
	public void sort() {
		System.out.println("Mergered with selection sort");
	}

}
