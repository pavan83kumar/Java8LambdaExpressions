package com.javabrains.tutorials;

public class TypeInferenceExample {

	public static void main(String[] args) {

		// StringLengthLambda stringLength = s -> s.length();
		printLambda(s -> s.length());

	}

	public static void printLambda(StringLengthLambda l) {
		System.out.println(l.getLength("hello"));
	}

	interface StringLengthLambda {
		int getLength(String s);

	}

}
