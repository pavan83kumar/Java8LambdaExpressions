package com.javabrains.tutorials;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();

	}

	public static void main(String[] args) {

		Greeter greet = new Greeter();
		//HelloWorldGreeting hello = new HelloWorldGreeting();
		//greet.greet(hello);
		
		Greeting greeting = () -> System.out.println("HelloWorld!");

	}
}
