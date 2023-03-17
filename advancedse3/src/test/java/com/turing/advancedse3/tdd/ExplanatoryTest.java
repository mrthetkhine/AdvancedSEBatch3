package com.turing.advancedse3.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class ExplanatoryTest {
	
	
	@BeforeAll
	static void setUpForAll()
	{
		System.out.println("Run Before all test case test.setUpForAll()");
	}
	@AfterAll
	static void setUpAfterAll()
	{
		System.out.println("Run After all test case test.setUpAfterAll()");
	}
	
	@BeforeEach                                         
    void setUp() {
        System.out.println("Run Before each test.setUp()");
    }
	@AfterEach                                         
    void cleanUp() {
        System.out.println("Run after each test.cleanUp()");
    }
	//@Disabled 
	@Test
	public void testAssert()
	{
		int result = 1+1;
		assertEquals( 2, result);
		
		System.out.println("First test");
	}
	@Test
	@DisplayName("This will be dipalyed in test suit")
	public void anotherTest()
	{
		System.out.println("Another test");
	}
}
