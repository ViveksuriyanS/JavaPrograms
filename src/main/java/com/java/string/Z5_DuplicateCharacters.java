package com.java.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Z5_DuplicateCharacters {

	public static void main(String[] args) {
		String st = "ABBCDEFF";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : st.toCharArray()) {
			map.computeIfPresent(c, (k, v) -> v + 1);
			map.computeIfAbsent(c, k -> 1);
		}

		// Frequency of character
		Map<Character, Integer> map1 = new HashMap<>();
		for(char c : st.toCharArray()) {
			map1.merge(c, 1, Integer::sum);
		}
		System.out.println(map);

		for (Entry<Character, Integer> entry : map.entrySet()) {
			//System.out.println(entry.getKey() + "\t" + entry.getValue());
			if (entry.getValue() > 1) {
				System.out.println("Duplicated characters");
				System.out.println(entry.getKey() + "\t" + entry.getValue());
			}
		}
	}

}
