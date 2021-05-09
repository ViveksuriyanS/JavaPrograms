package com.basics.java;

import java.util.Date;
import java.util.stream.Stream;

public class Stream8 {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		stream.forEach(System.out::println);

		Stream<Integer> stream1 = Stream.of(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		stream1.forEach(p -> System.out.println(p));

		Stream<Date> stream2 = Stream.generate(() -> {
			return new Date();
		});
		stream2.forEach(System.out::println);

	}

}

// Stream 