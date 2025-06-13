package javaLambdasProgramming.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseJava7 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Varsha","Ghuge",26),
				new Person("Sonali","Thakur",24),
				new Person("Shivani","sangale",25),
				new Person("Monali","Khade",23)
				
				
				
				);
		
		//step 1: sort the list by last name 
      Collections.sort(people,new Comparator<Person>() {

		@Override
		public int compare(Person o1, Person o2) {
			return o1.getLastName().compareTo(o2.getLastName());
		}
    		  
      });
      //step2 :create a method that print all the list of name
      
      printAll(people);
	}

	private static void printAll(List<Person> people) {
		
		for(Person p: people) {
			System.out.println(p);
		}
	
	//step3 : create a method that prints all the name with last name with c
	printLastNameBeginningWithC(people);
	
	}

	private static void printLastNameBeginningWithC(List<Person> people) {
		for(Person p: people) {
			if(p.getLastName().startsWith("T")) {
				System.out.println(p);
			}
			
		}
		
	}
}


