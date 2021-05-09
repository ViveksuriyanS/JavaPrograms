package com.java.string;

public class StringX {

	public static void main(String[] args) {
		String s1 = "Hello"; // Create a instance in String pool
		String s2 = "Hello"; // Will point to s1 instance in String pool (no new instance)
		String s3 = new String("Hello"); // Create an instance in Heap memory
		String s4 = s1.intern(); // Will point to s1 instance in String pool (no new instance)

		System.out.println(s1.equals(s2)); // true, just value comparison
		System.out.println(s1.equals(s3)); // true, just value comparison
		System.out.println(s1 == s2); // true (s1,s2 points to same ref in string pool) 
		System.out.println(s1 == s3); // false s1 in string pool, s3 in heap
		System.out.println(s1 == s4); // true, points to same ref in string pool
		System.out.println(s3 == s4); // false different reference
		
		Iterable it;
	}

}
