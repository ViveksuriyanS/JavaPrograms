package com.java.string;

import java.util.HashSet;
import java.util.Set;

public class Z3_AllUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "AAAAA";
		String st1 = "ABCDE";
		checkUniqueCharacter(st);
		checkUniqueCharacter(st1);
		checkUniqueCharacterUsingIndex(st1);
	}

	private static void checkUniqueCharacterUsingIndex(String st) {
		for (int i = 0; i < st.length(); i++) {
			if (st.indexOf(st.charAt(i)) != st.lastIndexOf(st.charAt(i))) {
				System.out.println("Not unique characters in String");
				return;
			}
		}

		System.out.println("All unique characters in String");
	}

	private static void checkUniqueCharacter(String st) {
		Set<Character> set = new HashSet<Character>();
		for (char ch : st.toCharArray()) {
			set.add(ch);
		}
		if (set.size() == st.length()) {
			System.out.println("All unique characters in String");
		} else {
			System.out.println("Not unique characters in String");
		}

	}

}
