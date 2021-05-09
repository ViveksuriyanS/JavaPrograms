package com.version.java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamFunction {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("_________________");

		// Enhanced for loop
		for (int i : list) {
			System.out.println(i);
		}
		System.out.println("_________________");

		// Using Iterator
		Iterator<Integer> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("_________________");

		// All the above methods are external iteration
		// External Iteration is trying to fetch from outside

		// Internal Iteration using lambda expression
		// For every value of i -> it will print i
		list.forEach(i -> System.out.println(i));
		System.out.println("_________________");

		list.forEach(System.out::println);

		// Stream API is an internal iteration
		list.stream().forEach(System.out::println);
		int ix = list.stream().map(i -> i * 2).reduce(0, (c, e) -> c + e);
		System.out.println(ix);

		// Doubt the values
		list.forEach(i -> doubleValue(i));
		list.forEach(StreamFunction::doubleValue);
	}

	public static void doubleValue(int i) {
		System.out.println(i * 2);
	}
}
