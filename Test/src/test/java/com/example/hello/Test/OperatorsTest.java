package com.example.hello.Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class OperationsTest {

	
	
	
	@Test
	public void test() {
		
		Operations op = new Operations();
		
		int num1 = 10;
		int num2 = 5;
		
		assertEquals(15, op.sum(num1, num2));
		assertEquals(5, op.sub(num1, num2));
		assertEquals(50, op.mol(num1, num2));
		assertEquals(2, op.div(num1, num2));
		
	}

}
