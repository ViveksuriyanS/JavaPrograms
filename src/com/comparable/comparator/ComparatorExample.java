package com.comparable.comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		List<Snacks> snackMenu = new LinkedList<Snacks>();
		snackMenu.add(new Snacks("Pani puri", 30, 3.8d));
		snackMenu.add(new Snacks("Masala puri", 40, 4.1d));
		snackMenu.add(new Snacks("Dahi puri", 50, 4.5d));
		snackMenu.add(new Snacks("Bhel puri", 30, 3.9d));
		snackMenu.add(new Snacks("Samosa Chat", 30, 4.0d));
		snackMenu.add(new Snacks("Kachori Chat", 30, 2.9d));
		snackMenu.add(new Snacks("Spl Mix Chat", 60, 4.7d));
		System.out.println("Sorted by rating");
		Collections.sort(snackMenu, new RatingCompare());
		System.out.println(snackMenu.toString());

		System.out.println("Sorted by name");
		Collections.sort(snackMenu, new NameCompare());
		System.out.println(snackMenu.toString());

		System.out.println("Sorted by Price");
		Collections.sort(snackMenu);
		System.out.println(snackMenu.toString());
	}

}

// To compare String
class NameCompare implements Comparator<Snacks> {

	@Override
	public int compare(Snacks o1, Snacks o2) {
		return o1.name.compareTo(o2.name);
	}

}

// Comparator to compare rating 
class RatingCompare implements Comparator<Snacks> {

	@Override
	public int compare(Snacks o1, Snacks o2) {
		if (o1.rating == o2.rating)
			return 0;
		else if (o1.rating > o2.rating)
			return -1;
		else
			return 1;
	}

}

// Default Comparable for comparing price
class Snacks implements Comparable<Snacks> {
	String name;
	int price;
	double rating;

	public Snacks(String name, int price, double rating) {
		this.name = name;
		this.price = price;
		this.rating = rating;

	}

	public String toString() {
		return name + "--" + price + "--" + rating;
	}

	@Override
	public int compareTo(Snacks o1) {
		// TODO Auto-generated method stub
		if (price == o1.price) {
			return 0;
		} else if (o1.price > price) {
			return 1;
		} else {
			return -1;
		}
	}
}

// This doesn't affect the actual list
// It multiple sorting sequence with multiple element to be compared
// Inside java.util
// To sort List using Collections.sort(List , Comparator Class)