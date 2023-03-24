package com.turing.advancedse3.oop;

public class Teacher extends Human{

	String school;
	Teacher(String name, int age,String school) {
		super(name, age);
		this.school = school;
	}
	void work()
	{
		System.out.println("Teacher teach student");
	}
	
}
