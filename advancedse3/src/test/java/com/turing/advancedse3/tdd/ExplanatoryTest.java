package com.turing.advancedse3.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ExplanatoryTest {
	
	@Test
	public void testAssert()
	{
		int result = 1+1;
		assertEquals( 2, result);
	}
}
