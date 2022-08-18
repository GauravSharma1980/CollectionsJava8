package com;

import java.util.*;

/*
 * Java 8 provides BiConsumer to evaluate a map as it has accept method that takes 2 arguements and does not retrun anything.
 * 
 */
public class MapCollection {
	
	
	public static void main(String[] args)
	{
		
		Employee gaurav = new Employee("Gaurav",1001,12000);
		Employee gauri = new Employee("Gauri",1002,13000);
		Employee gauransh = new Employee("Gauransh",1003,14000);
		Employee bhairavi = new Employee("Bhairavi",1004,15000);
		Employee trinetra = new Employee("Trinetra",1005,16000);
		
		
		
		Map<Integer,Employee> employeeMap = new HashMap<>();
		
		employeeMap.put(1001, gaurav);
		employeeMap.put(1002, gauri);
		employeeMap.put(1003, gauransh);
		employeeMap.put(1004, bhairavi);
		employeeMap.put(1005, trinetra);
		
		
		employeeMap.forEach((key,value)-> System.out.println(key+"\t"+value));

		List<String> nameList = Arrays.asList("Gaurav","Kalia","Kalu","Pitambar","Shaunik","Bhrugu");

		nameList.removeIf(name->name.equals("Gaurav"));

		//nameList.stream().forEach(System.out::println);

	}

}
