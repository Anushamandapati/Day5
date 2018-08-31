package com.capgemini.day5.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.capgemini.day5.domain.MyCalculator;
import com.capgemini.day5.domain.TaxCalculator;
import com.capgemini.day5.exception.EmployeeNameInvalidException;
import com.capgemini.day5.exception.TaxNotEligibleException;

public class TaxCalculatorTest 
{
	
	
	@Test
	void testCalculateTaxWithInvalidName()
	{
		Exception e;
		e = assertThrows(Exception.class, () ->TaxCalculator.calculateTax("", true, 30000));
		assertEquals("The employee name cannot be empty",e.getMessage());
	}
	
	@Test
	void testCalculateTaxWithIneligible() 
	{
		Exception e;
		e = assertThrows(Exception.class, () ->TaxCalculator.calculateTax("Tim", true, 1000));
		assertEquals("The employee does not need to pay tax",e.getMessage());
	}
	
	
	@Test
	void testCalculateTaxWithInvalidCountry()
	{
		Exception e;
		e = assertThrows(Exception.class, () ->TaxCalculator.calculateTax("Ron", false, 34000));
		assertEquals("The employee should be an Indian citizen for calculating tax",e.getMessage());
	}
}
