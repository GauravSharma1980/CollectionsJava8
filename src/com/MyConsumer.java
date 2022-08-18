package com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MyConsumer
{
	public static void main(String[]args)
	{
		List<Employee> employeeList = new ArrayList<>();
		
		employeeList.add(new Employee("Gaurav", 1001,12000));
		employeeList.add(new Employee("Garima", 1002,13000));
		employeeList.add(new Employee("Gauransh", 1003,14000));
		employeeList.add(new Employee("Bhairavi", 1004,16000));
		
		
				
		employeeList.forEach(new TestConsumer());
		
	}
}

class TestConsumer  implements Consumer<Employee>{

	@Override
	public void accept(Employee t) {

		System.out.println(t.getAge()+"\t"+t.getName());
	}
	

}
