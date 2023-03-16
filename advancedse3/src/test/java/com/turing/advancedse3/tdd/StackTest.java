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
	@Test
	public void testPopWhenThereIsOneElement()
	{
		int size = stack.size();
		stack.push(100);
		
		int element = stack.pop();
		
		assertEquals(100, element);
		assertEquals(size, stack.size());
	}
	@Test
	public void testPopWhenThereIsMultipleElement()
	{
		int size = stack.size();
		for(int i=1;i<=5;i++)
		{
			stack.push(i);
		}
		
		for(int i=5;i >=1; i--)
		{
			int element = stack.pop();
			assertEquals(i, element);
		}
		
		assertEquals(size, stack.size());
	}
	@Test
	public void testPopWhenThereIsFullElement()
	{
		int size = stack.size();
		for(int i=1;i<= Stack.STACK_SIZE;i++)
		{
			stack.push(i);
		}
		
		for(int i=Stack.STACK_SIZE;i >=1; i--)
		{
			int element = stack.pop();
			assertEquals(i, element);
		}
		
		assertEquals(size, stack.size());
	}
	@Test
	public void testPopWhenStackIsEmpty()
	{
		StackunderflowException exception = assertThrows(StackunderflowException.class, ()->{
			stack.pop();
		});
		assertEquals(Stack.STACK_UNDERFLOW_MESSAGE, exception.getMessage());
	}
	@Test
	@DisplayName("Stack must throw stackunderflow exception when pop is call more than push")
	public void testPopMoreThanPush()
	{
		
		for(int i=1;i<=5;i++)
		{
			stack.push(i);
		}
		StackunderflowException exception = assertThrows(StackunderflowException.class, ()->{
			for(int i=1;i<=5+1;i++)
			{
				stack.pop();
			}
		});
		assertEquals(Stack.STACK_UNDERFLOW_MESSAGE, exception.getMessage());
		
	}
}
