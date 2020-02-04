package com.java.java8;

// Lambda Expression works only on Functional Interface (Interface with only one function )

public class LambdaExpressions {

	public static void main(String[] args) {
		// Way 1
		StringLengthInterface getLength1 = (String s) -> s.length();
		int a = getLength1.getLength("Hello");
		System.out.println(a + " is the length of the string using type 1");

		// Way2
		StringLengthInterface getLength2 = (s) -> s.length();
		System.out.println(getLength2.getLength("Hello") + " is the length of the string using type 2");

		// Way 3
		StringLengthInterface getLength3 = s -> s.length();
		System.out.println(getLength3.getLength("Hello") + " is the length of the string using type 3");
	}

}

interface StringLengthInterface {
	int getLength(String s);
}

// It is a functional language
//

// Always in OOP functions are written inside class
// Lets to create function without belonging to any class