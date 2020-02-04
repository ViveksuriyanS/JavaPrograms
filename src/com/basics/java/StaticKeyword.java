package com.basics.java;

public class StaticKeyword {

	// Static variables / Class level variables
	// Common to all the objects
	static int i;
	String x;
	// It is used to initialize the values of the data members
	// Static block will be executed even before the main method is executed
	static {
		i = 10;
	}
	static {
		i = 20;
	}

	public static void main(String[] args) {
		// static variable instance sharing
		// Creating 2 objects of the class
		StaticKeyword obj1 = new StaticKeyword();
		StaticKeyword obj2 = new StaticKeyword();

		// Static variable can be used directly without objects
		System.out.println(i);
		// Will not be accessible
		// System.out.println(x); 

		obj1.i = 5;
		obj2.i = 11;
		System.out.println(obj1.i);
		System.out.println(obj2.i); // Since shared commonly, the value will be changed.

	}

	public void func1() {
		System.out.println(i);
	}
	
	

}

class Class1 {

}

// Static variables are shared across all the instances of the class and can be accessed without even creating the object
// Static methods can be accessed directly in static and non-static methods without creating object
// Static class can be 