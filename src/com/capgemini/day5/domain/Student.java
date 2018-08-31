package com.capgemini.day5.domain;

import com.capgemini.day5.exception.AgeNotWithinRangeException;
import com.capgemini.day5.exception.NameNotValidException;

public class Student {
	private long rollNo;
	private String name;
	private int age;
	private String course;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(long rollNo, String name, int age, String course) throws NameNotValidException, AgeNotWithinRangeException {
		super();
		this.rollNo = rollNo;
		for(int i=0;i<name.length();i++)
		{
			if((name.charAt(i)>='A' && name.charAt(i)<='Z')||(name.charAt(i)>='a' && name.charAt(i)<='z'))
			{
			}
			else
				throw new NameNotValidException("Enter only alphabets");
		}
		this.name = name;
		if(age>=15 && age<=21)
		{
			this.age = age;
		}
		else
			throw new AgeNotWithinRangeException("Age is out of Range");
		
		this.course = course;
	}


	public long getRollNo() {
		return rollNo;
	}


	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}
}
	
	

