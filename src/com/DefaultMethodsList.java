package com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class DefaultMethodsList {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee("Gaurav", 20, 2000000));
		empList.add(new Employee("Gauri", 19, 1000000));
		empList.add(new Employee("Gauransh", 5, 3000000));
		empList.add(new Employee("Martin", 40, 300000));

		//empList.forEach(e -> System.out.println(e));

		empList.removeIf(employee -> "Martin".equals(employee.getName()));

		//empList.forEach(e -> System.out.println(e));
		
		empList.forEach(new Consumer<Employee>(){
			
			@Override
			public void accept(Employee employee) {
				System.out.println(employee.getName() +"/t"+employee.getAge());
			}
		});

		System.out.println("Another way.................");
        empList.forEach((Employee employee) -> {
				System.out.println(employee.getName() +"/t"+employee.getAge());
			});
		
        System.out.println("Now Predicates......");
        empList.stream().filter(new Predicate<Employee>() {
        	
        	public boolean test(Employee employee)
        	{
        	   return employee.getName().equals("Gaurav");
        	}

			
        }).forEach(employee ->System.out.println(employee.getAge()));
        
        
        System.out.println("Now Predicates in another Style.....");
        
        
        empList.stream().filter((Employee employee) -> employee.getName().equals("Gaurav")).forEach(employee->System.out.println(employee.getAge()));
        
	}
}
