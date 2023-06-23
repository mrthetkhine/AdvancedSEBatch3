package com.turing.advancedse3.tdd.kata;

import java.util.ArrayList;
import java.util.List;

interface PredicateFun
{
	boolean predicate(int i);
}
class Rule
{
	PredicateFun fun;
	String data;
	boolean original ;
	int i;
	Rule(PredicateFun fun,String data)
	{
		this.fun = fun;
		this.data = data;
	}
	Rule(PredicateFun fun,boolean original)
	{
		this.fun = fun;
		this.original = original;
	}
	
}
public class FizzBuzzPrinter {
	List<Rule> rules;
	FizzBuzzPrinter(List<Rule> rules)
	{
		this.rules = rules;
	}
	
	public String print()
	{
		String data = "";
		
		for(int i=1;i<=100;i++)
		{
			boolean ruleFire = false;
			for(Rule rule : this.rules)
			{
				if(rule.fun.predicate(i))
				{
					data += rule.data;
					ruleFire = true;
					break;
				}
			}
			if(!ruleFire)
			{
				data += (i+"\n");
			}
		}
		return data;
	}
	

	public static void main(String[]args)
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
		String data = printer.print();
		System.out.println(data);
	}
}
