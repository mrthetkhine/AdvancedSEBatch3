package com.turing.advancedse3.designpattern.bridge;

public class Circle extends Shape{

	public Circle(DrawingAPI api)
	{
		super(api);
	}
	@Override
	public void draw() {
		this.api.drawCircle();
	}

}
