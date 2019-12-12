package com.inheritance;

public class MethodHiding extends Parent {

	public static void main(String[] args) {
		Parent obj = new MethodHiding();
		// This is not possible since the display method is hidden by declaring as
		// private
//		obj.display(); 
		obj.print();
	}

	private static void display() {
		System.out.println("Base Display");
	}

	public void print() {
		System.out.println("Base Print");
	}

}

class Parent {
	private static void display() {
		System.out.println("Base Display");
	}

	public void print() {
		System.out.println("Base Print");
	}
}
