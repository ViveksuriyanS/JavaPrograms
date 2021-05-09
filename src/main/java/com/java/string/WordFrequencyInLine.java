package com.java.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyInLine {

	public static void main(String[] args) {
		String h = "Hello Hi this is Hi from Hello Hi this";
		String word = "Hi";
		if (h.contains(word)) {
			System.out.println("Hi");
		}
		String[] freq = h.split("Hi");
		System.out.println(Arrays.toString(freq));
		System.out.println(freq.length);
		
		Map<String,Integer> s = new HashMap<String,Integer>();
		s.put("a",1);
		s.put("b",1);
		s.put("c",1);
		s.put("d",1);
		s.put("e",1);
        ArrayList<String> result = new ArrayList<String>();
        s.entrySet().stream().sorted((k1,k2)->k1.getValue().compareTo(k2.getValue())).forEach(e -> {
            for(int i=0; i<2;i++) {
                result.add(e.getKey());
            }
        });
	}

}
