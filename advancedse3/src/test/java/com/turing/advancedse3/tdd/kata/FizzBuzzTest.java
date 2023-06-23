package com.turing.advancedse3.tdd.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class FizzBuzzTest {

	@Test
	void testPrintNumber()
	{
		Rule rule3 = new Rule( (i)-> i% 3==0 && i%5 ==0,"FizzBuzz\n");
		Rule rule1 = new Rule( (i)-> i% 3 ==0,"Fizz\n");
		Rule rule2 = new Rule( (i)-> i% 5 ==0,"Buzz\n");
		Rule rule4 = new Rule( (i)-> true,true);
		
		List<Rule> rules = new ArrayList<Rule>();
		rules.add(rule3);
		rules.add(rule2);
		rules.add(rule1);
		
		FizzBuzzPrinter printer = new FizzBuzzPrinter(rules);
		String result = printer.print();
		String expected = FizzBuzzTest.getFizzBuzzResult();
		
		assertEquals(expected, result);
		
		
	}
	static String getFizzBuzzResult()
	{
		String data = "";
		for(int i=1;i<=100;i++)
		{
			if (i %3 == 0 && i %5==0)
			{
				data += "FizzBuzz\n";
			}
			else if(i%3==0)
			{
				data += "Fizz\n";
			}
			else if(i%5==0)
			{
				data += "Buzz\n";
			}
			else
			{
				data += (i +"\n");
			}
			
		}
		return data;
	}
	
}
