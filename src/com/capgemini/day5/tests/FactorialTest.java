package com.capgemini.day5.tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day5.domain.Factorial;
import com.capgemini.day5.exception.FactorialException;

class FactorialTest {

	@Test
	void testGetFactorial() throws Exception {
		Factorial f1=new Factorial() ;
		assertThrows(FactorialException.class,()->f1.getFactorial(100));
		assertEquals(120,f1.getFactorial(5));
	}

}