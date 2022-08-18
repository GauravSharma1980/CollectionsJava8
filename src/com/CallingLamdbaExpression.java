package com;

@FunctionalInterface
interface GreaterOrNotInterface
{
	public boolean test(int firstNumber,int secondNumber);
}

public class CallingLamdbaExpression {

	public static void main(String[] args)
	{
		GreaterOrNotInterface multiplicationInterface = (firstNumber,secondNumber)-> (firstNumber > secondNumber);
		
		System.out.println("result"+multiplicationInterface.test(10,20));
		
	}
}
