package com.java.polymorphism;

public class A {

	public static void main(String[] args) {
		A a = new A();
		A a1 = new B();
		A a2 = new C();
		a.alphabet();
		a1.alphabet();
		a2.alphabet();
	}

	public void alphabet() {
		System.out.println("A is an alphabet");
	}
}

class B extends A {
	public B() {

	}

	public void alphabet() {
		System.out.println("B is an alphabet");
	}

	public void vowel() {
		System.out.println("B is not a vowel");
	}
}

class C extends A {
	public void alphabet() {
		System.out.println("C is an alphabet");
	}
}
