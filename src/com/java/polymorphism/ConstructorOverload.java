package com.java.polymorphism;

public class ConstructorOverload {

	public static void main(String[] args) {
		Overriding o1 = new Overriding(1);
		Overriding o2 = new Overriding(1, 2);
		Overriding o3 = new Overriding(1, 2, 3);
		
	}

}

class Overriding {
	int i;
	int j;
	int k;

	public Overriding(int i) {
		System.out.println(i);
	}

	public Overriding(int i, int j) {
		System.out.println(i + j);
	}

	public Overriding(int i, int j, int k) {
		System.out.println(i + j + k);
	}
}

// We can overload Constructors and Methods