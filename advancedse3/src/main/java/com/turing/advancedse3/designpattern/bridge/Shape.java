package com.turing.advancedse3.designpattern.bridge;

public abstract class Shape {
	   DrawingAPI api;
	   
	   Shape(DrawingAPI api)
	   {
	       this.api = api;
	   }
	   abstract void draw();
}
