package com.java.polymorphism;

public class ObjectCall {

	public static void main(String[] args) {
		ShowMethods s = new ShowMethods();
		s.show(null); // null is not an object, so it calls show(String s)

//		Ambiguous method call. Both
//				show (String) and (Integer)

	}

}

class ShowMethods {
	public void show(String s) {
		System.out.println("String " + s);
	}

	public void show(Object s) {
		System.out.println("Object");
	}

	// If we enable Integer method -> will cause ambiguity so compiler error
//	public void show(Integer s) {
//		System.out.println("Integer");
//	}
}
