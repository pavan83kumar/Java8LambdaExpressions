package com.javabrains.tutorials;

public class MethodReferenceExample1 {

	public static void main(String[] args) {

		// Thread t = new Thread(()->printMessage());
		// The above code can also be written by using the method reference.
		Thread t = new Thread(MethodReferenceExample1::printMessage);// () ->method()
		t.start();
	}

	public static void printMessage() {
		System.out.println("Hello");
	}

}
