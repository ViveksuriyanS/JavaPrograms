package com.version.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFlatmap {
    public static void main(String[] args) {
        List<ProductA> ProductAsList = new ArrayList<>();

        //Adding ProductAs
        ProductAsList.add(new ProductA(1, "HP Laptop", 25000f));
        ProductAsList.add(new ProductA(2, "Dell Laptop", 30000f));
        ProductAsList.add(new ProductA(3, "Lenevo Laptop", 28000f));
        ProductAsList.add(new ProductA(4, "Sony Laptop", 28000f));
        ProductAsList.add(new ProductA(5, "Apple Laptop", 90000f));

        List<String> laptopNames = ProductAsList.stream().map(ProductA::getName).collect(Collectors.toList());
        System.out.println(laptopNames);


        // FlatMap() is used to flatten a 2 level map to single level
        List<Integer> evens = Arrays.asList(2, 4, 6);
        List<Integer> odds = Arrays.asList(3, 5, 7);
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11);
        List<Integer> numbers = Stream.of(evens, odds, primes).flatMap(list -> list.stream()).collect(Collectors.toList());
        System.out.println("flattend list: " + numbers);

    }
}


