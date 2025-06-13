package com.java8.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapMethod {

	public static void main(String[] args) {
		List<String> departmentList = new ArrayList<>();
		departmentList.add("Supply");
		departmentList.add("HR");
		departmentList.add("Sales");
		departmentList.add("Marketing");
		
		Stream<String> deptStream = departmentList.stream();
				deptStream.map(word->word.toUpperCase())
				.forEach(System.out::println);
		
		
		
		
	}

}
