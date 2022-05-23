package com.example.hello.Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert; 


public class OperatorsTest {
	private Operations o;

	@Before
	public void setUp() {
	//Arrange
		o = new Operations();
	}

	@Test
	public void testAdd() { 
		Float a = 15f; Float b = 20f; 
		Float expectedResult = 35f;
		//Act 
		Float result = o.add(a, b);
		//Assert
		Assert.assertEquals(expectedResult, result);
	}

	@Test
	public void testSubtract() {
		Float a = 25f; Float b = 20f; 
		Float expectedResult = 5f; 
		Float result = o.sub(a, b);
		Assert.assertEquals(expectedResult, result);
	}

	@Test
	public void testMultiply() {
		Float a = 10f; Float b = 25f;
		Float expectedResult = 250f;
		Float result = o.mul(a, b);
		Assert.assertEquals(expectedResult, result);
	}

	@Test
	public void testDivide() throws Exception {
		Float a = 10f; Float b = 2f; 
		Float expectedResult = 5f; 
		Float result = o.div(a, b);
	Assert.assertEquals(expectedResult, result); 
	}

	@Test(expected = Exception.class)
	public void testDivideByZero() throws Exception { 
		Float a = 15f; Float b = 0f;
		o.div(a, b);
	} 
}
