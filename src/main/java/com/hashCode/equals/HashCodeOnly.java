package com.hashCode.equals;

import java.util.HashMap;

public class HashCodeOnly {

	public static void main(String a[]) {

		HashMap<Price1, String> hm = new HashMap<Price1, String>();
		hm.put(new Price1("Banana", 20), "Banana");
		hm.put(new Price1("Apple", 40), "Apple");
		hm.put(new Price1("Orange", 30), "Orange");
		// creating new object to use as key to get value
		Price1 key = new Price1("Banana", 20);
		System.out.println("Hashcode of the key: " + key.hashCode());
		System.out.println("Value from map: " + hm.get(key));
		System.out.println(hm);
	}
}

class Price1 {

	private String item;
	private int price;

	public Price1(String itm, int pr) {
		this.item = itm;
		this.price = pr;
	}

	// Hashcode generates a code using hashing function
	// To store
	public int hashCode() {
		//System.out.println("In hashcode");
		int hashcode = 0;
		hashcode = price * 20;
		hashcode += item.hashCode();
		//System.out.println(hashcode);
		return hashcode;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return "item: " + item + " Price: " + price;
	}
}