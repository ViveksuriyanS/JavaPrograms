package com.java.oops.Inheritance;

public class ConstructorRelation {

	public static void main(String[] args) {
		// Creating object of child class
		childClass c = new childClass();
		c.print();
	}

}

class childClass extends parentClass {
	public childClass() {
		System.out.println("Child class constructor is called...");
	}

	public void print() {
		System.out.println("When child class object is created, implicitly it calls super() constructor");
		
	}
}

class parentClass {
	public parentClass() {
		System.out.println("Parent class constructor is called...");
	}
}