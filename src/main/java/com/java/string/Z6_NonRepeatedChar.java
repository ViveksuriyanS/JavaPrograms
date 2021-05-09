package com.java.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Z6_NonRepeatedChar {

	public static void main(String[] args) {
		String st = "AXXHABCDERSDFHSIER";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : st.toCharArray()) {
			map.computeIfPresent(c, (key, value) -> value + 1);
			map.computeIfAbsent(c, value -> 1);
		}
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.println(entry.getKey() + " is the first non-repeated character");
				return;
			}
		}
	}

}
