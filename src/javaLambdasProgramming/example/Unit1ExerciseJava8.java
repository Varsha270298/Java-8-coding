package javaLambdasProgramming.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Unit1ExerciseJava8 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Varsha","Ghuge",26),
				new Person("Sonali","Thakur",24),
				new Person("Shivani","sangale",25),
				new Person("Monali","sarade",23)
				
				
				
				);
		//step 1: sort the list by last name 
		Collections.sort(people,(p1, p2)->p1.getLastName().compareTo(p2.getLastName()));
		System.out.println("printing All Person");
		 printAll(people);
		 
		 
		// System.out.println("printing all the persons which Lastname start with S ");
		
	}

		private static void printAll(List<Person> people) {
			
			for(Person p: people) {
				System.out.println(p);
			}
		
	}

	

}
