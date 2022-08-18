package com;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ReferenceStaticMethods {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		//Runnable task = ()-> System.out.println("i am a running task");
		
		//executorService.execute(task);
		
		
		Runnable task = ReferenceStaticMethods::myTask;
		
		executorService.execute(task);
		
	}
	private static void myTask()
	{
		System.out.println("i am running task....");
	}
}
