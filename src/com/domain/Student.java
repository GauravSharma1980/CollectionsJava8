package com.domain;

public class Student  implements Comparable<Student>{

	private String name;
	private int age;
	
	public Student(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Student student) {
		return this.age > student.getAge()?1:-1;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
