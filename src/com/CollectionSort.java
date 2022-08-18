package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;import java.util.function.Consumer;

public class CollectionSort {

	
	public static void main(String[] args )
	{
		List<Employee> employeeList = new ArrayList<>();
		
		employeeList.add(0,new Employee("gaurav",1001,12000));
		employeeList.add(1,new Employee("gauransh",1002,13000));
		employeeList.add(2,new Employee("bhairavi",1003,14000));
		employeeList.add(3,new Employee("karali",1004,15000));
		employeeList.add(4,new Employee("bhairav",1005,16000));
		
		System.out.println("before the sorting.....");
		employeeList.forEach(new Consumer<Employee>() {

			@Override
			public void accept(Employee t) {
				System.out.println(t.getName()+ "/t"+t.getAge());
			}
			
		});

		System.out.println("******************************");

		employeeList.forEach(element->System.out.println(element));


		System.out.println("after the sorting.....");
				
		Collections.sort(employeeList,(firstEmployee,secondEmployee)-> firstEmployee.getName().compareTo(secondEmployee.getName()));
		
		employeeList.forEach((employee) -> System.out.println(employee.getName() +"/t"+ employee.getAge()));
	}
}
