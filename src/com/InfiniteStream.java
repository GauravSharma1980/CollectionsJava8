package com;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InfiniteStream {

	public static void main(String[]args) {
		
		//List<Integer> result =  Stream.iterate(0,i -> i+ 1).limit(10).collect(Collectors.toList());
		List<Integer> result =  Stream.iterate(0,i -> i+ 1).collect(Collectors.toList());

		System.out.println(result);
	}
}
