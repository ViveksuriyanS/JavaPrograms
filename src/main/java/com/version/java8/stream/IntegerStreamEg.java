package com.version.java8.stream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class IntegerStreamEg {

	public static void main(String[] args) {
		int[] inp = { 1, 2, 3, 4, 8, 5, 6, 7, 8 };

		// 1
		// IntStream to stream integer Values
		// Present inside java.util.stream
		// Get the minimum value from the array
		int min = IntStream.of(inp).min().getAsInt();
		System.out.println("Minimum number from input array is " + min);

		// 2
		// In similar way we can get maximum values also
		int max = IntStream.of(inp).max().getAsInt();
		System.out.println("Maximum number from input array is " + max);

		// 3
		// Easier and condition checked
		IntStream.of(inp).min().ifPresent(System.out::println); // Print using consumer
		IntStream.of(inp).max().ifPresent(n -> System.out.println(n)); // Print using Lambda

		// 4
		// Similar other functions that stream provides
		IntStream.of(inp).average().ifPresent(System.out::println); // Average of array values
		System.out.println(IntStream.of(inp).sum()); // Sum of array values
		System.out.println(IntStream.of(inp).count()); // Count of array values
		IntStream.of(inp).distinct().forEach(System.out::print);
		;

		// Earlier each and every time we are invoking static method using class name
		// Instead we can create an object once and can use the same functions multiple
		// times
		IntSummaryStatistics intsummaryStats = IntStream.of(inp).summaryStatistics();
		intsummaryStats.getMin();
		intsummaryStats.getMax();
		intsummaryStats.getAverage();
		intsummaryStats.getSum();
		intsummaryStats.getCount();

		// Print first 3 least number from array (No duplicates)
		System.out.println("\nPrint first 3 least numbers from array");
		// Original array is not mutated
		IntStream.of(inp).distinct().sorted().limit(3).forEach(System.out::println);
		IntStream.of(inp).sorted().limit(3).sum();

		IntStream.of(inp).distinct(); // removes duplicates
		IntStream.of(inp).sorted(); // Sorts the array
		System.out.println("");
		IntStream.of(inp).skip(2).forEach(System.out::println); // Skips first 2 index values
		IntStream.of(inp).limit(3).forEach(System.out::println); // Limit till index 3
		IntStream.of(inp).filter(num -> num % 2 == 0).forEach(System.out::print); // Prints all even numbers
		IntStream.of(inp).filter(num -> num % 2 != 0).forEach(System.out::print); // Prints all odd numbers
		IntStream.of(inp).map(map -> map * 2).forEach(System.out::println);

		// Check if there are any odd/even number present in array
		IntStream.of(inp).anyMatch(n -> n % 2 == 0); // If any one even present (T/F)
		IntStream.of(inp).allMatch(n -> n % 2 == 0); // Check if all are even (T/F)
	}

}
