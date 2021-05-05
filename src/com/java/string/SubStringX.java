package com.java.string;

public class SubStringX {

	public static void main(String[] args) {
		String st = "HelloWorld";

		// HelloWorld
		// 0123456789
		// Skips 0 to 4 index then it will append to the string

		for (int i = 0; i < st.length(); i++) {
			System.out.println(st.substring(i));
		}

		for (int i = st.length() - 1; i >= 0; i--) {
			System.out.println(st.substring(i));
		}
		System.out.println(st.substring(st.length() - 1));
		System.out.println(st.subSequence(0, 3));
	}

}


// substring(int startIndex) => Start from that very index

// substring(int startIndex, int endIndex) => Starts from startIndex and ends before endIndex
