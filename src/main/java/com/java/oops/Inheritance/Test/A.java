package com.java.oops.Inheritance.Test;

public class A {

	public static void main(String[] args) {
		A a = new B(); // Can't access X
		a.Y(); // Only can access Y

		B b = new B();
		b.X(); // Can access X
		b.Y(); // Can access Y
	}

	public int Y() {
		return 7;
	}
}
