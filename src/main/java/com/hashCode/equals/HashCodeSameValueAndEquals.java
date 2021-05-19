package com.hashCode.equals;

import java.util.HashMap;

public class HashCodeSameValueAndEquals {

	public static void main(String a[]) {

		HashMap<FruitPrice, String> hm = new HashMap<FruitPrice, String>();
		hm.put(new FruitPrice("Banana", 20), "Banana");
		hm.put(new FruitPrice("Apple", 40), "Apple");
		hm.put(new FruitPrice("Orange", 30), "Orange");
		hm.put(new FruitPrice("Orange", 30), "Orange");
		// creating new object to use as key to get value
		FruitPrice key = new FruitPrice("Banana", 20);
		System.out.println("Hashcode of the key: " + key.hashCode());
		System.out.println("Value from map: " + hm.get(key));
		System.out.println(hm);
		System.out.println(hm.size());
	}
}

class FruitPrice {

	private String item;
	private int fruitPrice;

	public FruitPrice(String itm, int pr) {
		this.item = itm;
		this.fruitPrice = pr;
	}

	// Hashcode generates a code using hashing function
	// To store
	public int hashCode() {
		//System.out.println("In hashcode");
		int hashcode = 1; // My hashcode always returns 1
//		hashcode = fruitPrice * 20;
//		hashcode += item.hashCode();
//		//System.out.println(hashcode);
		return hashcode;
	}

	// Equals
	public boolean equals(Object obj) {
		System.out.println("In equals");
		if (obj instanceof FruitPrice) {
			FruitPrice pp = (FruitPrice) obj;
			return (pp.item.equals(this.item) && pp.fruitPrice == this.fruitPrice);
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

	public int getfruitPrice() {
		return fruitPrice;
	}

	public void setfruitPrice(int fruitPrice) {
		this.fruitPrice = fruitPrice;
	}

	public String toString() {
		return "item:" + item + " and Price:" + fruitPrice ;
	}
}

// If hashcode always returns 1 -> all elements will be stored in same bucket
// While put(), if already one element is present in Bucket's Map
// and If equals() method checks its value then duplicate values wont be inserted