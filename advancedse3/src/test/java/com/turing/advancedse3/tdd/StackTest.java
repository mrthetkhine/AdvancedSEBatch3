package com.turing.advancedse3.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class StackTest {
	Stack stack = new Stack();
	
	@Test
	public void testPushWhenStackIsEmpty()
	{
		//Act
		stack.push(100);
		
		//Assert
		assertEquals(1,stack.size());
		int result = stack.pop();
		assertEquals(100, result);
		
	}
	@Test
	public void testPushWhenStackHaveSomeElement()
	{
		//Arrange
		
		
		//Act
		stack.push(100);
		stack.push(200);
		stack.push(300);
		
		//Assert
		assertEquals(3,stack.size());
		int result = stack.pop();
		assertEquals(300, result);
		
	}
	@Test
	public void testPushElementShouldPopInOrder()
	{
		for(int i=0;i<Stack.STACK_SIZE;i++)
		{
			stack.push(i);
		}
		assertEquals(10, stack.size());
		for(int i=9;i>=0;i--)
		{
			assertEquals(i,stack.pop());
		}
	}
	@DisplayName("Stack must throw stackoverflow exception when push is call after stack is full")
	@Test
	public void testWhenPushOverStackSize()
	{
		//Arrange
		for(int i=0;i<Stack.STACK_SIZE;i++)
		{
			stack.push(i);
		}
		//Act
		StackOverflowException exception = assertThrows(StackOverflowException.class,()->{
			stack.push(0);
		});
		assertEquals(Stack.STACK_OVERFLOW_MESSAGE, exception.getMessage());
	}
	
}
