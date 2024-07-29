package com.capg.jse.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest 
{
	public static Calculator obj = null;

	@BeforeEach
	public static void init()
	{
		obj = new Calculator();
	}
	
	@AfterEach
	public static void destroy()
	{
		obj = null;
	}
	
	@Test
	public void testAdd()
	{
		int actualResult = obj.add(12, 13);
		int expectedResult = 25;
		assertEquals(expectedResult , actualResult);
	}
	
	@Test
	public void testMul()
	{
		int actualResult = obj.mul(3, 5);
		int expectedResult = 15;
		assertEquals(expectedResult , actualResult);
	}

}
