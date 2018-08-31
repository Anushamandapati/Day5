package com.capgemini.day5.domain;

import com.capgemini.day5.exception.CountryNotValidException;
import com.capgemini.day5.exception.EmployeeNameInvalidException;
import com.capgemini.day5.exception.TaxNotEligibleException;

public class TaxCalculator
{
	public static double calculateTax(String empName,boolean isIndian,double empSal)throws EmployeeNameInvalidException,TaxNotEligibleException, CountryNotValidException 
	{
		double taxAmount=0;
		if(isIndian == true)
		{
			if(empName == "" || empName == null)
			{
				throw new EmployeeNameInvalidException("The employee name cannot be empty");
			}
			
			else if(empSal > 100000)
			{
				taxAmount = empSal *8/100 ;
				System.out.println("Tax Amount is" +taxAmount);
			}
			else if(empSal>50000 && empSal<100000)
			{
				taxAmount =empSal *6/100;
				System.out.println("Tax Amount is" +taxAmount);
			}
			else if(empSal>30000 && empSal<50000) 
			{
				taxAmount =empSal *5/100;
				System.out.println("Tax Amount is" +taxAmount);
			}
			else if(empSal>10000 && empSal<30000)
			{
				taxAmount =empSal *4/100;
				System.out.println("Tax Amount is" +taxAmount);
			}
			else if(empSal <10000)
			{
				throw new TaxNotEligibleException("The employee does not need to pay tax");
			}
		}
		else
		{
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
		}
		return taxAmount;
		
	}
}
