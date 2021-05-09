package com.java.string;

public class Z2_Anagram {

	public static void main(String[] args) {
		String st1 = "Hello";
		String st2 = "eloHl";
		System.out.println(st1.substring(3, 4));
		for(int i = 0 ; i < st1.length() ; i++) {
			int index = st2.indexOf(st1.charAt(i));
			if(index != -1) {
				st2 = st2.substring(0, index) + st2.substring(index, st2.length());
			} else {
				System.out.println("Not Anagram");
			}
		}
		if(st2.isEmpty()) {
			System.out.println("Not Anagram");
		} else {
			System.out.println("Both strings are Anagram");
		}
	}

}
