package com.domain;

import java.util.List;

public class StudentDetail {
	
	private int category;
	private List<Student> studentList;
	
	
	public StudentDetail(int category, List<Student> studentList) {
		super();
		this.category = category;
		this.studentList = studentList;
	}


	public int getCategory() {
		return category;
	}


	public void setCategory(int category) {
		this.category = category;
	}


	public List<Student> getStudentList() {
		return studentList;
	}


	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	
	
	
	
}
