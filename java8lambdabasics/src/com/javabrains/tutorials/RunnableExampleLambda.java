package com.javabrains.tutorials;

public class RunnableExampleLambda {

	public static void main(String[] args) {

		/*Thread newThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("In run method");

			}
		});*/
		
		//Rather than writing all the above code we can write the inline Lambda.
		Thread newThread = new Thread(() ->System.out.println("In run method"));
		
		newThread.start();
	}

}
