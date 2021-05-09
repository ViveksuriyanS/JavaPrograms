package com.java.string;

public class Z1_StringReverse {

	public static void main(String[] args) {
		String st = "Hello";
		System.out.println(reverseUsingLoop(st));
		System.out.println(reverseUsingStringBuilder(st));
		System.out.println(reverseUsingRecursive(st));

	}

	private static String reverseUsingRecursive(String st) {
		// System.out.println(st + "\t" + st.length());
		// If string length is 1 return same string
		if (st.length() == 1) {
			return st;
		}

		// Hello
		// 01234
		return st.substring(st.length() - 1) + reverseUsingRecursive(st.substring(0, st.length() - 1));

		// substring (0 to 4) ==> 0 1 2 3 => H e l l
		// substring (0 to 3) ==> 0 1 2 => H e l
	}

	private static String reverseUsingStringBuilder(String st) {
		StringBuilder stBuil = new StringBuilder(st);
		return stBuil.reverse().toString();
	}

	private static String reverseUsingLoop(String st) {
		char res[] = new char[st.length()];
		int x = 0;
		for(int i = st.length()-1; i >=0 ; i--) {
			res[x] = st.charAt(i);
			x++;
		}
		return String.valueOf(res);
	}

}
