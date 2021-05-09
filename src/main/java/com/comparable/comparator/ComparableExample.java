package com.comparable.comparator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ComparableExample {

    public static void main(String[] args) {
        List<Food> foodMenu = new LinkedList<Food>();
        Food f = new Food("Boiled Egg", 10);
        Food f0 = new Food("Raagi Mudde", 20);
        Food f1 = new Food("Chicken Biryani", 180);
        Food f2 = new Food("Mutton Biryani", 240);
        Food f3 = new Food("Egg Biryani", 120);
        Food f4 = new Food("Plain Biryani", 100);
        foodMenu.add(f);
        foodMenu.add(f0);
        foodMenu.add(f1);
        foodMenu.add(f2);
        foodMenu.add(f3);
        foodMenu.add(f4);
        System.out.println(foodMenu.toString());
        Collections.sort(foodMenu);
        System.out.println(foodMenu.toString());
    }

}

class Food implements Comparable<Food> {
    String name;
    int price;

    public Food(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " - " + price;
    }

    public int compareTo(Food food) {
        // Will be compared based on variable price
        if (this.price == food.price)
            return 0;
        else if (food.price < this.price) {
            return -1;
        } else {
            return 1;
        }
    }
}

// Affects the original class
// It is single sorting sequence where only one element will be compared
// Inside java.lang
// To sort List using Collections.sort(List)
