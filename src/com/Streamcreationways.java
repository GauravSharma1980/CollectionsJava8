package com;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Streamcreationways {

	public static void main(String[] args) {
		
		Stream<String> build = Stream.<String>builder().add("One").add("Two").add("Three").build();

		build.forEach(System.out::println);
		
		Stream<String> limit = Stream.generate(()-> "hi").limit(10);

		Supplier<String> valueToBePrinted = () -> "bi";

		Stream<String> limit2 = Stream.generate(valueToBePrinted).limit(10);

		limit.forEach(System.out::println);

		limit2.forEach(System.out::println);
		
		
		Stream<String> intValues = Stream.generate(()-> "element").limit(10);
		
		intValues.forEach(System.out::println);
		
		
		IntStream intStream =  IntStream.range(1,6);
		
		intStream.forEach(System.out::println);
		
		System.out.println("Elements with Range Closed...");
		
		IntStream rangeClosedStream = IntStream.rangeClosed(1,10);
		
		rangeClosedStream.forEach(System.out::println);
		
		
		System.out.println("*********************************************");
		
		Stream<Integer> intStreamIterate = Stream.iterate(10,i->i+2).limit(10);
		
		intStreamIterate.forEach(System.out::println);
		
		
		Random random = new Random();
		
		
		DoubleStream doubleStream =  random.doubles().limit(10);
		
		IntStream intStreamRandom = random.ints().limit(10);
		
		LongStream longStreamRandom =  random.longs().limit(10);
		
		float floatRandom = random.nextFloat();
		
		System.out.println("...............................doubleStream.....................................");
		
		doubleStream.forEach(System.out::println);
		
		System.out.println("...............................IntStream.....................................");
		
		intStreamRandom.forEach(System.out::println);
		
		
		System.out.println("...............................longStream.....................................");
		
		longStreamRandom.forEach(System.out::println);
		
		System.out.println("...............................floatRandom.....................................");
		
		
		System.out.println(floatRandom);
		
		
		
		
	}
	
	

}
