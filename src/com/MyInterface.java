package com;

import java.util.List;

import com.domain.Student;

public interface MyInterface {

	
	public default List<Student> sortStudent(List<Student> studentList)
	{
		java.util.Collections.sort(studentList);
		return studentList;
	}
	
	public static void greetStudent(String name)
	{
	    System.out.println("Hello Mr"+name);
	}
	
	public abstract Integer getMaxNumber(List<Integer> numberList );
}
