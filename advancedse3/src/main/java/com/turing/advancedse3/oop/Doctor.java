package com.turing.advancedse3.oop;

public class Doctor extends Human{

	String speciality;
	Doctor(String name, int age,String speciality) {
		super(name, age);
		this.speciality = speciality;
	}
	
	void work()
	{
		System.out.println("Doctor cure patient");
	}

}
