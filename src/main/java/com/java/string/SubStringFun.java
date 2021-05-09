package com.java.string;

public class SubStringFun {

	public static void main(String[] args) {
		String s = "Hey hello! My Name is Vivek";
		// Starts from 6th index of the string literal
		System.out.println(s.substring(6));
		// From 0 to 7th index
		String subString = s.substring(0, 8);
		System.out.println(subString);

		// Returns Character Sequence
		CharSequence subSeq = s.subSequence(0, 4);
		System.out.println(subSeq);

		// trim()
		String s1 = "    Space     ";
		System.out.println(s1);
		// Select the output using cursor
		System.out.println(s1.trim());

		// valueOf() - coverts int,long,float,double,boolean,char and char array
		// into string.
		String stx = String.valueOf(10);
		System.out.println(stx);
	}

}
