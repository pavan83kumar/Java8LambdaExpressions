package com.javabrains.tutorials;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Pavan", "dsdsa", "22"), new Person("Vinod", "cfdd", "25"),
				new Person("Praveeen", "byt", "26"), new Person("Sasi", "aaa", "24"));

		System.out.println("Lambda...expression");
		// printLastNameBeginningWithP(people, p -> true, p ->
		// System.out.println(p));
		// The above code can also b written as below..in the last argument.

		printLastNameBeginningWithP(people, p -> true, System.out::println); // (p) -> method(p)

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
