package com.turing.advancedse3.designpattern.strategy;

public class SelectionSort implements SortStrategy{

	@Override
	public void sort() {
		System.out.println("Sorted with selection sort");
	}

}
