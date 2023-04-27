package com.turing.advancedse3.designpattern.strategy;

public class Context {
	SortStrategy sortStrategy;

	public SortStrategy getSortStrategy() {
		return sortStrategy;
	}

	public void setSortStrategy(SortStrategy sortStrategy) {
		this.sortStrategy = sortStrategy;
	}
	
	public void sort()
	{
		this.sortStrategy.sort();
	}
}