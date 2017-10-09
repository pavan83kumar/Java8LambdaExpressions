package com.javabrains.tutorials;

import java.util.Arrays;
import java.util.List;

public class StreamsExample1 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Pavan", "dsdsa", "22"), new Person("Vinod", "cfdd", "25"),
				new Person("Praveeen", "byt", "26"), new Person("Sasi", "aaa", "24"));
		/*people.stream().
		filter(p -> p.getFirstName().startsWith("P"))
		.forEach((p) -> System.out.println(p.getFirstName()));*/
		
		long count =people.stream().
		filter( p -> p.getLastName().startsWith("a")).
		count();
		System.out.println(count);
		}

}
