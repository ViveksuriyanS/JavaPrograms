package com.java.string;

public class CamelCaseWord {

	public static void main(String[] args) {
		String input = "this is a sentence";
		String output = "";
		// First letter Capital
		for (String st : input.split(" ")) {
			st = st.toUpperCase().charAt(0) + st.substring(1, st.length());
			output += st + " ";
		}
		System.out.println(output);

		// All letters capital except first letter
		output = "";
		for (String st : input.split(" ")) {
			st = st.substring(0, 1) + st.substring(1, st.length()).toUpperCase();
			output += st + " ";
		}
		System.out.println(output);

		// Second letter capital
		output = "";
		for (String st : input.split(" ")) {
			if (st.length() > 1) {
				st = st.substring(0, 1) + st.toUpperCase().charAt(1) + st.substring(2, st.length());
			}
			output += st + " ";
		}
		System.out.println(output);
	}

}
