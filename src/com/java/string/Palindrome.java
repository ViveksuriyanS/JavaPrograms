package com.java.string;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Palindrome {

	public static void main(String[] args) {
		String s1 = "ababa";
		System.out.println(checkPalindrome(s1));

		// Check longest palindrome substring
		String s2 = "HSODFUSSABASSDE";
		longestPalindrome(s2);
	}

	private static void longestPalindrome(String s2) {
		String input = "";
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < s2.length(); i++) {
			for (int j = i; j < s2.length(); j++) {
				input = s2.substring(i, j);
				if (checkPalindrome(input)) {
					map.put(input, input.length());
				}
			}
		}
		Entry<String, Integer> max = Collections.max(map.entrySet(), Map.Entry.comparingByValue());
		System.out.println(max.getKey() + "   " + max.getValue());
	}

	private static boolean checkPalindrome(String s1) {
		int start = 0;
		int end = s1.length() - 1;
		while (start < end) {
			if (s1.charAt(start) == s1.charAt(end)) {
				start++;
				end--;
			} else {
				return false;
			}
		}
		return true;
	}

}
