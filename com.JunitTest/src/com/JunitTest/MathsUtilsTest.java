package com.JunitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathsUtilsTest {

	@Test
	public void test() {
		MathsUtils obj = new MathsUtils();
		int add = obj.add(7, 5);
		assertEquals(12, add);
		
		int subtract = obj.subtract(7, 5);
		assertEquals(2, subtract);
		
		int multiply = obj.multiply(7, 5);
		assertEquals(35, multiply);
		
		int square = obj.square(5);
		assertEquals(25, square);
		
	}

}
