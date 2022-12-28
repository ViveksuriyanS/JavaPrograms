package com.version.java8.stream;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class LinearSearchStream {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        Scanner scanner = new Scanner(System.in);
        int searchKeyword = scanner.nextInt();
        linearSearch(arr, searchKeyword);
    }

    private static void linearSearch(int[] arr, int searchKeyword) {
        OptionalInt optionalInt = Arrays.stream(arr).filter(x -> x == searchKeyword).findFirst(); // Returns OptionalInt
        optionalInt.ifPresent(System.out::println);
    }
}
