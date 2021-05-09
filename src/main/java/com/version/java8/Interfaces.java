package com.version.java8;

public class Interfaces extends showClass implements I,J {

	public static void main(String[] args) {
		Interfaces intx = new Interfaces();
		// Normal method
		intx.hello();

		// Static method
		I.hi();

		// Default method
		intx.show();
	}

	@Override
	public void hello() {
		System.out.println("Methods declared in Interfaces needs to be defined in class");

	}

}

// Till java 7 we cannot define a method in Interface,
// From Java 8 we can declare a method using Default keyword
// By default all methods in Interface are "public abstract"
interface I {
	void hello();

	// Static method can be accessed directly with the help of Interface name
	static void hi() {
		System.out.println("Static method can be directly declared");
	}

	// Default method

	default void show() {
		System.out.println("Default method in Interface");
	}
}

interface J {
	default void show() {
		System.out.println("Ambiguity - show method in J and I Interfaces");
	}
}

class showClass {
	// If we remove this method, then show in I and J will be contradicting
	public void show() {
		System.out.println("Show method in class will get high precedence over Interface - Third rule");
	}
}