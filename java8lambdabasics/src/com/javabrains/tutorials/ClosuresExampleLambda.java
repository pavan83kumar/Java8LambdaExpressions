package com.javabrains.tutorials;

public class ClosuresExampleLambda {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		// The b value is fixed and it is the closure.
		// Where ever the Lambda expression goes the frozen value goes along
		// with it.
		doProcess(a, i -> System.out.println(i + b));

	}

	public static void doProcess(int i, Process p) {
		p.process(i);
	}

}

interface Process {
	void process(int i);
}
