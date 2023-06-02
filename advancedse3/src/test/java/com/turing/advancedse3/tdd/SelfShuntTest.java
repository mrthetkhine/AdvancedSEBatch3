package com.turing.advancedse3.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.turing.advancedse3.solid.Car;
import com.turing.advancedse3.solid.Engine;

@ExtendWith(MockitoExtension.class)
public class SelfShuntTest extends Engine {
	boolean engineStart = false;
	public void start()
	{
		this.engineStart = true;
	}
	
	@Test
	public void testCar(){
		
		Car car = new Car(this);
		
		car.start();
		assertEquals(true, this.engineStart);
	}
}
