package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReducerAndCollectors {

	
	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(1,1,1);
		
		int result = intList.stream().reduce(23,(a,b)->a+b);
		
		System.out.println(result);
	
		List<String> nameList = new ArrayList<String>();
		
		nameList.add("Gaurav");
		nameList.add("Krishna");
		
		List<String> resultList = nameList.stream().map(name->name.toLowerCase()).collect(Collectors.toList());
		
		resultList.forEach(System.out::println);

		List<String> nameList2 = Arrays.asList("Gaurav","Sharma");


	}
	
	
	
}
