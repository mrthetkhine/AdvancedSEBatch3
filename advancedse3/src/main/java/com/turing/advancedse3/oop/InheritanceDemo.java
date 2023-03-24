package com.turing.advancedse3.oop;

class Animal
{
	void eat()
	{
		System.out.println("Animal eat");
	}
	void work()
	{
		System.out.println("Animal work");
	}
}
public class InheritanceDemo {
	public static void main(String[]args)
	{
		Human human = new Doctor("Aung Win",40,"General Health");
		//human.eat();
		human.work();
		
		human = new Teacher("Daw Hla",45,"BEHS 1");
		//human.eat();
		human.work();
		
		//human = new Animal();
	}
}
