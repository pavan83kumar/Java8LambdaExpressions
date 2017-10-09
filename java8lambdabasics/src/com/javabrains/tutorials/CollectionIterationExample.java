package com.javabrains.tutorials;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Pavan", "dsdsa", "22"), new Person("Vinod", "cfdd", "25"),
				new Person("Praveeen", "byt", "26"), new Person("Sasi", "aaa", "24"));
		// The below iterators are called iterators
		// Using the for loop
		System.out.println("Using the for loop");
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}
		// Using the foreach loop
		System.out.println("Using the foreach loop");
		for (Person person : people) {
			System.out.println(person);
		}
		
		// The below two iterators are internal iterators
		// Using the Java 8 features...method reference
		System.out.println("Using the Java8 features..Method reference");
		people.forEach(System.out::println);
		
		// Using the Lambda expression.
		System.out.println("Using the Lambda expression");
		people.forEach((p) -> System.out.println(p)); // It is the consumer
	}

}
