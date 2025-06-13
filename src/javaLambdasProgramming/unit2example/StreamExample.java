package javaLambdasProgramming.unit2example;

import java.util.Arrays;
import java.util.List;

import javaLambdasProgramming.example.Person;

public class StreamExample {

	

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Varsha","Ghuge",26),
				new Person("Sonali","Thakur",24),
				new Person("Shivani","sangale",25),
				new Person("Monali","Khade",23)
				
				
				
				);
	/*	people.stream()
		.filter(p->p.getLastName().startsWith("T"))
		.forEach(p ->System.out.println(p.getFirstName()));
		
		*/
		
		Long count= people.stream()
		.filter(p ->p.getLastName().startsWith("K"))
		.count();
		
		System.out.println(count);
		
		
		Long count1= people.parallelStream()
				.filter(p ->p.getLastName().startsWith("K"))
				.count();
				
				System.out.println(count1);

	}

}
