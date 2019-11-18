package com.java.string;

import java.util.Scanner;

public class RemoveCharacterFromString {

	public static void main(String[] args) {
		String input = "This is the input string";
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		removeCharacterAt(input, i);
		scan.close();

	}

	public static void removeCharacterAt(String st, int i) {
		st = st.substring(0, i) + st.substring(i + 1);
		// Skips 4 letter then it will append to the string

		System.out.println(st.substring(4));
		System.out.println(st);
	}

}
