package com.turing.advancedse3.tdd;

public class Stack {
	
	public static final String STACK_UNDERFLOW_MESSAGE = "Stackundeflow exception in pop when stack is empty";

	public static final String STACK_OVERFLOW_MESSAGE = "Stack is full, cannot push element";

	public static final int STACK_SIZE = 10;

	private int[] items = new int[STACK_SIZE];
	private int top = -1;
	
	public void push(int element)
	{
		if(this.top == STACK_SIZE-1)
		{
			throw new StackOverflowException(STACK_OVERFLOW_MESSAGE);
		}
		this.items[++top] = element;
	}
	public int pop()
	{
		if(top==-1)
		{
			throw new StackunderflowException(STACK_UNDERFLOW_MESSAGE);
		}
		return this.items[top--];
	}
	public int size()
	{
		return top+1;
	}
	
}
