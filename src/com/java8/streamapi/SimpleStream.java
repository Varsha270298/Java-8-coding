package com.java8.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SimpleStream {

	public static void main(String[] args) {
      
		List<String> departmentList = new ArrayList<>();
		departmentList.add("Supply");
		departmentList.add("HR");
		departmentList.add("Sales");
		departmentList.add("Marketing");
		
		Stream<String> deptStream = departmentList.stream();
		deptStream.forEach(System.out::println);
		
		Stream<String> inStream = Stream.of("Easy","Bytes","Java");
		inStream.forEach(System.out::println);
		
		Stream<String> ParallelStream = departmentList.stream();
		ParallelStream.forEach(System.out::println);
		
		
		Stream<String>  emptyStream = Stream.empty();
		emptyStream.forEach(System.out::println);
		
		
		
		
		
		
	}

}
