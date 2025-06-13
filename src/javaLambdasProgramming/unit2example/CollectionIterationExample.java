package javaLambdasProgramming.unit2example;

import java.util.Arrays;
import java.util.List;

import javaLambdasProgramming.example.Person;

public class CollectionIterationExample {



	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Varsha","Ghuge",26),
				new Person("Sonali","Thakur",24),
				new Person("Shivani","sangale",25),
				new Person("Monali","Khade",23)
				
				
				
				);
		System.out.println("Using for loop");//external iterator
		for(int i = 0; i<people.size();i++) {
			System.out.println(people.get(i));
			
			
		}
		System.out.println("Using forEach loop");
		for(Person p :people) {
			System.out.println(p);
		}
		System.out.println("Using Lambda forEach loop");//internal iterator
		//people.forEach(p ->System.out.println(p));
		people.forEach(System.out::println);
	}

}
