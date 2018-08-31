package com.capgemini.day5.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.day5.domain.Student;
import com.capgemini.day5.exception.AgeNotWithinRangeException;
import com.capgemini.day5.exception.NameNotValidException;

class StudentTest {

	
	@Test
	void testStudent()throws NameNotValidException,AgeNotWithinRangeException {
		//	assertEquals(null,new Student(11,"Anusha",21,"Java"));
			assertThrows(AgeNotWithinRangeException.class,()-> new Student(11,"Anusha",22,"Java"));
		
	}

}