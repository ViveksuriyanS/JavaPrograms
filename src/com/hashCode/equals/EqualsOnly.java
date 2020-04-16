package com.hashCode.equals;

import java.util.HashMap;

public class EqualsOnly {

	public static void main(String a[]) {

		HashMap<Price2, String> hm = new HashMap<Price2, String>();
		hm.put(new Price2("Banana", 20), "Banana");
		hm.put(new Price2("Apple", 40), "Apple");
		hm.put(new Price2("Orange", 30), "Orange");
		// creating new object to use as key to get value
		Price2 key = new Price2("Banana", 20);
		System.out.println("Hashcode of the key: " + key.hashCode());
		System.out.println("Value from map: " + hm.get(key));
		System.out.println(hm);
	}
}

class Price2 {

	private String item;
	private int price;

	public Price2(String itm, int pr) {
		this.item = itm;
		this.price = pr;
	}

	// Equals
	public boolean equals(Object obj) {
		System.out.println("In equals");
		if (obj instanceof Price2) {
			Price2 pp = (Price2) obj;
			return (pp.item.equals(this.item) && pp.price == this.price);
		} else {
			return false;
		}
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