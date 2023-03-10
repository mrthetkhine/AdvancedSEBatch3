package com.turing.advancedse3.solid;

class Engine
{
	public void start()
	{
		System.out.println("Engine start");
	}
}
class DieselEngine extends Engine
{
	public void start()
	{
		System.out.println("DieselEngine start");
	}
}

public class Car {
	Engine engine;
	
	Car(Engine engine)
	{
		this.engine = engine;
	}
	public void start()
	{
		System.out.println("Car start");
		this.engine.start();
	}
	
}
