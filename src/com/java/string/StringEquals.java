package com.java.string;

public class StringEquals {

	public static void main(String[] args) {
		String s1 = "String";
		String s2 = new String("String");
		System.out.println(s1 == s2); // Objects are different
		System.out.println(s1.equals(s2)); // To compare object values

		StringBuilder s3 = new StringBuilder("String");
		StringBuilder s4 = new StringBuilder("String");
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		System.out.println(s3.toString() == s4.toString()); // Objects are different
		System.out.println(s3.toString().equals(s4.toString()));
	}

}

// StringBuilderX doesn't override Object's ".equals()" function, so both object references are not the same
// For StringBuilderX we can use s3.toString().equals(s4.toString())