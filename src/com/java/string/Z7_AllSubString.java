package com.java.string;

public class Z7_AllSubString {

	public static void main(String[] args) {
		String st = "ABCD";
		for (int i = 0; i < st.length(); i++) {
			for (int j = i; j < st.length(); j++) {
				System.out.println(st.substring(i, j + 1));
			}
		}
	}

}
