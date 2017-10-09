package com.javabrains.tutorials;

public class ThisReferenceExample {

	public void doProcess(int i, Process p) {
		p.process(i);
	}
	
	// lets try Lambda in instance method.
	public void execute(){
		doProcess(10,  i -> {
			System.out.println("The value of i is " + i);
			System.out.println(this);
			
		});
	}
	
	public String toString() {
		return "This is the ThisReferenceExample";
	}
	

	public static void main(String[] args) {

		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
		
		// The below code is the Anonymous inner class and "this"
		//reference is overridden by anonymous refernce. 
		/*thisReferenceExample.doProcess(10, new Process() {
			public void process(int i) {
				System.out.println("The value of i is " + i);
				// We are in the anonymous inner class and
				// I am trying to print the "this"
				// We cannot use the "this in the static context"
				System.out.println(this);
			}

			public String toString() {
				return "This is the anonymous inner class";
			}

		});*/
		
		// Using Lambda
		// We cannot use "this" in Lambda..it refers to the instance of the class.
		// and also it is in the main method ...which is static context.
		thisReferenceExample.doProcess(10,  i -> {
			System.out.println("The value of i is " + i);
			//System.out.println(this); -> it will not work in static context.
			
		});
		thisReferenceExample.execute();

	}

}
