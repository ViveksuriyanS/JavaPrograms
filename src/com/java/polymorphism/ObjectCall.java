package com.java.polymorphism;

public class ObjectCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowMethods s = new ShowMethods();
		s.show(null); // null is not an object, so it calls show(String s)
	}

}

class ShowMethods {
	public void show(String s) {
		System.out.println("String");
	}

	public void show(Object s) {
		System.out.println("Object");
	}
}