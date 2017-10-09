package com.javabrains.tutorials;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import org.omg.Messaging.SyncScopeHelper;

public class Unit1PracticeInJava8 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Pavan", "dsdsa", "22"), new Person("Vinod", "cfdd", "25"),
				new Person("Praveeen", "byt", "26"), new Person("Sasi", "aaa", "24"));

		Collections.sort(people, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));

		System.out.println("Printing all the people");

		printAll(people);
		System.out.println("Person LastName that start with the 'P'");
		printLastNameBeginningWithP(people, p -> p.getLastName().startsWith("P"), p -> System.out.println(p));

		System.out.println("Printing the people whose firstName starts with the 'P'");

		printLastNameBeginningWithP(people, p -> p.getFirstName().startsWith("P"),
				p -> System.out.println(p.getFirstName()));

		System.out.println("Lambda...expression");
		printLastNameBeginningWithP(people, p -> true, p -> System.out.println(p));

	}

	// The below method prints all the elements in the list.
	private static void printAll(List<Person> people) {
		for (Person p : people) {
			System.out.println(p);
		}

	}

	private static void printLastNameBeginningWithP(List<Person> people, Predicate<Person> predicate,
			Consumer<Person> consumer) {
		for (Person p : people) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}

}
