package com.version.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamAPICollection {
    public static void main(String[] args) {
        List<ProductA> ProductAsList = new ArrayList<>();

        //Adding ProductAs  
        ProductAsList.add(new ProductA(1, "HP Laptop", 25000f));
        ProductAsList.add(new ProductA(2, "Dell Laptop", 30000f));
        ProductAsList.add(new ProductA(3, "Lenevo Laptop", 28000f));
        ProductAsList.add(new ProductA(4, "Sony Laptop", 28000f));
        ProductAsList.add(new ProductA(5, "Apple Laptop", 90000f));

        // Map -> Collect
        Set<Float> floatSet  = ProductAsList.stream().map(p->p.price).collect(Collectors.toSet()); // To Set
        List<Float> floatList  = ProductAsList.stream().map(p->p.price).collect(Collectors.toList()); // To List
        System.out.println(floatSet);
        System.out.println(floatList);

        // Filter -> Map -> Collect
        Set<Float> floatSet1 = ProductAsList.stream().filter(p->p.price > 25000).map(p->p.price).collect(Collectors.toSet()); // To Set
        System.out.println(floatSet1);

        //
        Map<String, ProductA> productAMap = ProductAsList.stream().collect(Collectors.toMap(p->p.name, Function.identity()));
        Map<String, List<ProductA>> productAMap1 = ProductAsList.stream().collect(Collectors.groupingBy(ProductA::getName));
        System.out.println(productAMap);
        System.out.println(productAMap1);
    }
}

class ProductA {
    int id;
    String name;
    float price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public ProductA(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}