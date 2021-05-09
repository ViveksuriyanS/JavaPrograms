package com.java.polymorphism;

public class MethodOverload {

	public static void main(String[] args) {
		OrderFood.orderFood("Biryani");
		OrderFood.orderFood("Biryani", "Boneless Chicken");
		OrderFood.Payment(222.22);
		OrderFood.Payment(180);
	}

}

class OrderFood {
	String mainDish;
	String sideDish;

	// By number of parameters
	public static void orderFood(String mainDish) {
		System.out.println(mainDish);
	}

	public static void orderFood(String mainDish, String sideDish) {
		System.out.println(mainDish + " " + sideDish);
	}

	// By data type of parameters
	public static void Payment(int price) {
		System.out.println(price);
	}

	public static void Payment(double price) {
		System.out.println(price);
	}

}

// Different signature methods
// Multiple methods with same name and different arguments and data type of arguments
// Data type or Number of arguments can vary between methods of same name
// It is called compile time polymorphism

// Advantage -> Increases the readability of the program

// Main method can be overloaded by main(String arg), main(String[] arg), main()
// But JVM consider main(String[] arg) as the main method