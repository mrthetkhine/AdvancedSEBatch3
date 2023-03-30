package com.turing.advancedse3.oop;

interface Flyable
{
	void fly();
}
class Bird implements Flyable
{

	@Override
	public void fly() {
		System.out.println("Bird fly");
		
	}
	
}
class Aeroplane implements Flyable
{
	@Override
	public void fly() {
		System.out.println("Aeroplane fly");
	}	
}
public class FlyableDemo {
	public static void main(String[]args)
	{
		Flyable flyable = new Bird();
		flyable.fly();
		
		flyable = new Aeroplane();
		flyable.fly();
	}
}
