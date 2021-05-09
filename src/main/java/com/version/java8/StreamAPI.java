package com.version.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        // In traditional way, we use for loop, with if condition, then put
        // Process, fetch, store
        List<Float> priceList = productsList.stream()
                .filter(product -> product.price > 28000) // Filtering data
                .map(p->p.price) // Fetching price map() defines data
                .collect(Collectors.toList()); // Collecting as list
        System.out.println(priceList);

        // Process, print
        productsList.stream().filter(p->p.price == 28000).forEach(p->System.out.println(p));
        productsList.stream().filter(p->p.price == 28000).forEach(p->System.out.println(p.name));

        // Iteration -> First n element divisible by 3
        Stream.iterate(1, i-> i+1) // Stream of data
                .filter(i->i%3==0) // Condition to filter
                .limit(3) // Number of element
                .forEach(i-> System.out.println(i)); // forEach print

        // Sum of price
        float f = productsList.stream().map(p->p.price).reduce(0f,(sum,price) -> sum+price);
        float f1 = productsList.stream().map(p->p.price).reduce(0.0f,Float::sum);
        double f2 = productsList.stream().collect(Collectors.summingDouble(p->p.price));
        System.out.println(f + "\t" + f1 + "\t" + f2);

        // Max and Min price
        Product min = productsList.stream().max((p1,p2)->p1.price > p2.price ? -1 : 1).get();
        Product min1 = productsList.stream().min((p1,p2)->p1.price < p2.price ? -1 : 1).get();
        Product max = productsList.stream().max((p1,p2)-> p1.price< p2.price ? -1 : 1).get();
        System.out.println(min + "\t" + min1);
        System.out.println(max);

        // count()
        long count = productsList.stream().map(p-> p).count();
        long count1 = productsList.stream().filter(p-> p.price > 28000).count();
        System.out.println(count + "\t" + count1);
    }
}

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

// Using stream we can filter, print, collect, convert data from Array, Collections or any input source
// Original data will not be modified
// It is lazy operator, will executed only when required
// It doesn't store processed data
// So each and everytime new stream must be invoked