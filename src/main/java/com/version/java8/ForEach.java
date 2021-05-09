package com.version.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class ForEach {

	public static void main(String[] args) {
		Integer[] x = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("Using basic loop");

		// ------------------External Loops------Time Consuming-----------------
		// Iterating using for loop
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]);
		}

		// Advanced for loop
		System.out.println("\nUsing advanced loop");
		for (int a : x) {
			System.out.print(a);
		}

		// ----------------Internal Loops----------Less Time---------------------
		ArrayList<Integer> arrList = new ArrayList<Integer>(Arrays.asList(x));

		// For Each over stream elements
		Consumer<Integer> action = System.out::print;
		System.out.println("\nUsing Stream ForEach loop");
		arrList.stream().forEach(action);

		// ForEach using list
		System.out.println("\nUsing list ForEach loop");
		arrList.forEach(System.out::print);

		// ---------------------------------------------------------------------
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("VellFire", 85);
		hm.put("Carnival", 35);

		// ForEach on Maps
		System.out.println("\nForEach on Maps");
		// On Key and Value pair
		Consumer<Map.Entry<String, Integer>> action1 = System.out::println; // Call by method
		hm.entrySet().forEach(action1);

		// On Key
		Consumer<String> action2 = System.out::println; // Method Reference
		hm.keySet().forEach(action2);

		// On Value
		Consumer<Integer> action3 = System.out::println;
		hm.values().forEach(action3);

		// ---------------------------------------------------------------------
		// Custom Actions
		Consumer<Map.Entry<String, Integer>> action4 = entry -> {
			System.out.println("Key is " + entry.getKey());
			System.out.println("Value is " + entry.getValue());
		};
		hm.entrySet().forEach(action4);
		// action1 and action4
		// Customized print is provided in customized action
	}

}

// With the list we can directly call forEach using Action 
// --- List.forEach(Action);

// With the map, we have to use either entrySet(), keySet(), values() using aciton
