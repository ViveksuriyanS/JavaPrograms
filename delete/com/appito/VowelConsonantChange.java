package com.appito;

public class VowelConsonantChange {

	public static void main(String[] args) {
		String s1 = "apptio";
		String s2 = "ezpgau";
		System.out.println(check(s1, s2));
	}

	private static boolean check(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;

		for (int i = 0; i < s1.length(); i++) {
			// Check if it is a vowel letter
			if (isVowel(s1.charAt(i)) && isVowel(s2.charAt(i))) {
				continue;
			} else if (!isVowel(s1.charAt(i)) && !isVowel(s2.charAt(i))) {
				continue;
			} else {
				return false;
			}
		}

		return true;

	}

	private static boolean isVowel(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			return true;
		return false;

	}

}
