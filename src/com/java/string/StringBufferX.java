package com.java.string;

public class StringBufferX {

	public static void main(String[] args) {

		// Even though the stBuff is set a Final, the value is being changed
		final StringBuffer stBuff = new StringBuffer("InputA");
		System.out.println("Hashcode of string buffer - " + stBuff.hashCode());
		stBuff.append(" InputB");
		System.out.println("Hashcode of string buffer after append - " + stBuff.hashCode());
		System.out.println(stBuff);

		// insert at position -> No Deletion, Inserts in between
		stBuff.insert(3, "InputX");
		System.out.println(stBuff);

		// replace at position x to y -> Deletes and Inserts
		stBuff.replace(3, 10, "XYZZZ1112222");
		System.out.println(stBuff);

		// delete
		stBuff.delete(4, 9);
		System.out.println(stBuff);

		// Reverse
		stBuff.reverse();
		System.out.println(stBuff);
	}

}

// StringBuffer is mutable (Value changeable) String.
// StringBuffer and StringBuilderX are mutable

// The hashcode for StringBuffer remains the same, thats why we can able to change the value even after the final is defined