package com.java.string;

import java.util.Scanner;

public class RemoveCharacterFromString {

	public static void main(String[] args) {
		String input = "This is the input string";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the index to be removed");
		int i = scan.nextInt();
		removeCharacterAt(input, i);
		scan.close();

	}

	public static void removeCharacterAt(String st, int i) {
		// Eg i = 2
		// This is the input string
		// 0123456789
		// 2 will be removed
		System.out.println(st.substring(0, i)); // 0,2 => 01 == Th
		System.out.println(st.substring(i + 1, st.length()));
		st = st.substring(0, i) + st.substring(i + 1, st.length());
		System.out.println(st);
	}

}
