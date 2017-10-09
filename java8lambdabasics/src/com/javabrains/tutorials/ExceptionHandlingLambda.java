package com.javabrains.tutorials;

import java.util.function.BiConsumer;

public class ExceptionHandlingLambda {

	public static void main(String[] args) {
		int[] intNumbers = { 1, 2, 3, 4 };
		int key = 0;

		process(intNumbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));
	}

	private static void process(int[] intNumbers, int key, BiConsumer<Integer, Integer> consumer) {

		for (int i : intNumbers) {
			consumer.accept(i, key);
		}
	}

	public static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		return (v, k) -> {
			try {
				consumer.accept(v, k);
			} catch (Exception e) {
				System.out.println("Exception caught in wrapper lambda");
			}
		};
	}

}
