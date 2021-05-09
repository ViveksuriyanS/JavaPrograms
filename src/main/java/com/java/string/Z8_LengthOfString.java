package com.java.string;

public class Z8_LengthOfString {

	public static void main(String[] args) {
		String X = "Length";

		int i = 0;
		for (char c : X.toCharArray()) {
			i++;
		}
		System.out.println("The length of the string is " + i);
		findLength(X);
	}

	private static void findLength(String x) {
		int i = 0;
		try {
			for(; ;i++) {
				x.charAt(i);
			}
		} catch(Exception e) {
			System.out.println("The length of the string is " + i);
		}
		
	}

}
