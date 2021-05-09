package com.basics.java;

public class Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildConstructor c = new ChildConstructor("a");
		ChildConstructor c1 = new ChildConstructor("a", 1);
		System.out.println(c.x + " " + c.a);
		System.out.println(c1.x + " " + c1.a);
	}

}

class ParentConstructor {
	int a = 5;
    // ######    1   ##########
	ParentConstructor() {
		
	}
	// ######    1   ##########
	
	ParentConstructor(int a) {
		// Line 1
		this.a = a;
	}
}

class ChildConstructor extends ParentConstructor {

	String x;

	// As there is no (no-argument constructor)
	ChildConstructor(String x) { // Will throw compileTime exception
		// ######    1   ##########
		super(); // super() will be placed by compiler if not written
		// ######    1   ##########
		// Line 1
		this.x = x;
	}

	ChildConstructor(String x, int a) {
		super(a);
		this.x = x;
		// this(x); Contructor cannot contain both super and this
	}
}

// 1st line inside constructor should be either super() or this()
// If super() is not defined at line 1 of constructor, compiler by default add super()

// Compulsory parent class should contain no argument constructor