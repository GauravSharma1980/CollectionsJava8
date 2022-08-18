package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.domain.Student;

public class CallingMyInterface implements MyInterface {
	

	public static void  main(String[]args)
	{
		MyInterface cmi = new CallingMyInterface();
		
		List<Student> studentList = new ArrayList<>();
		
		studentList.add(new Student("Gaurav", 10));
		studentList.add(new Student("Gauri", 63));
		studentList.add(new Student("Mannu", 47));
		studentList.add(new Student("Chunnu", 12));
		
		System.out.println("Before sorting on age......");
		studentList.forEach(student->System.out.println(student.getName()+"\t"+student.getAge()));
		cmi.sortStudent(studentList);
		System.out.println("After sorting  on age.....");
		studentList.forEach(student->System.out.println(student.getName()+"\t"+student.getAge()));
		
		MyInterface.greetStudent("Gaurav");
		
		List<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(3);
		System.out.println("max number :: "+cmi.getMaxNumber(intList));
	}

	
	
	@Override
	public Integer getMaxNumber(List<Integer> numberList) {
		int maxNumber = Collections.max(numberList);
		return maxNumber;
	}

}
