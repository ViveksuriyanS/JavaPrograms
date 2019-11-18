package com.basics.java;

public class FinalKeyword extends ParentClass {
	// Constant values, cannot be changed at any place
	final static double pie = 3.14d;

	// Blank final variable
	final int century;

	// Static blank Final Variable
	final static int half_century;
	// Will be initialized in static block
	static {
		half_century = 50;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pie);
	}

	public FinalKeyword() {
		century = 100;
	}

	// overriding the final method from Parent Class
	// Rename the name as PrintText as it will not let you override
	// Will ask you to remove final keyword from parentClass
	void printText1() {
		System.out.println("Overriding printText method");
	}

}

class ParentClass {

	final void printText() {
		System.out.println("In Parent Class");
	}
}

// This class cannot be extended
final class FinalClass {

}

// Variable -> Values cannot be modified
// Method -> Cannot be overridden
// Class -> Cannot be extended