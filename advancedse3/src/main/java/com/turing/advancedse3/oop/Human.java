package com.turing.advancedse3.oop;

public class Human {
	String name;
	int age;
	
	Human(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	void eat()
	{
		System.out.println("Human eat");
	}
	void work()
	{
		System.out.println("Human "+this.name+" work");
	}
}
