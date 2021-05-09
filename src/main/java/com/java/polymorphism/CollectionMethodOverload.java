package com.java.polymorphism;

import java.util.List;

public class CollectionMethodOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void m1(List<String> s) {

	}

	// But override with method "m1" is not possible
	// During runtime the generics inside the <> will be removed
	public void m2(List<Integer> s2) {

	}
}
