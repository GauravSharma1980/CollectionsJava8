package com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Person {
	private String name;
	private int age;

	public Person() {

	}

	public Person(String name, int age) {
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

}

public class ReferenceToInstanceMethod {

	public static void main(String[] args) {

		List<Person> personList = new ArrayList<>();
		
		personList.add(new Person("gaurav",10));
		personList.add(new Person("gauri",11));
		personList.add(new Person("bhairavi",12));
		personList.add(new Person("kali",13));
		
		List<String> personNameList = ReferenceToInstanceMethod.getPersonNameList(personList,Person::getName);
		
		personNameList.forEach(System.out::println);
	}

	private static List<String> getPersonNameList(List<Person> personList,Function<Person,String> function) {
		List<String> results =  new ArrayList<>();
		personList.forEach(person->results.add(function.apply(person)));
		return results;
	}

}
