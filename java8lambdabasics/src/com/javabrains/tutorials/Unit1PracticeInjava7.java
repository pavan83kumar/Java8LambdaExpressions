package com.javabrains.tutorials;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1PracticeInjava7 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Pavan", "dsdsa", "22"), new Person("Vinod", "cfdd", "25"),
				new Person("Praveeen", "byt", "26"), new Person("Sasi", "aa", "24"));

		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		System.out.println("Printing all the people");
		printAll(people);
		System.out.println("Person LastName that start with the 'P'");
		printLastNameBeginningWithP(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("P");
			}
		});

		System.out.println("Printing the people whose firstName starts with the 'P'");
		printLastNameBeginningWithP(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("P");
			}
		});
		/*
		 * Comparator<Person> p = new Comparator<Person>() {
		 * 
		 * @Override public int compare(Person o1, Person o2) { return
		 * o1.getLastName().compareTo(o2.getLastName()); } };
		 */
	}

	// The below method prints all the elements in the list.
	private static void printAll(List<Person> people) {
		for (Person p : people) {
			System.out.println(p);
		}

	}

	// Create a method that prints all people that have last name beginning with
	// 'P'...The below code is only applicable for the P....this can be done
	// better by taking another interface.
	/*
	 * private static void printLastNameBeginningWithP(List<Person> people) {
	 * for (Person p : people) { if (p.getLastName().startsWith("P")) {
	 * System.out.println(p); } }
	 * 
	 * }
	 */
	private static void printLastNameBeginningWithP(List<Person> people, Condition condition) {
		for (Person p : people) {
			if (condition.test(p)) {
				System.out.println(p);
			}
		}
	}

}
