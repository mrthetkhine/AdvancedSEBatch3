package com.turing.advancedse3.tdd.solid;

import static org.mockito.Mockito.atMost;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import com.turing.advancedse3.solid.*;


@ExtendWith(MockitoExtension.class)
public class CarTest {

	@Test
	public void testMethodCallAtMost()
	{
		Engine engine = Mockito.mock(Engine.class);
		Car car = new Car(engine);
		
		car.start();
		
		Mockito.verify(engine).start();
	}
}
