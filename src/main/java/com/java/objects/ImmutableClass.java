package com.java.objects;

import java.util.ArrayList;

public class ImmutableClass {

	public static void main(String[] args) {
		ArrayList<String> states = new ArrayList<String>();
		states.add("TamilNadu");
		states.add("Karnataka");
		states.add("Kerala");
		Country country = new Country("India", states);
		System.out.println(country.getCountryName());
		System.out.println(country.getStates());

		// At this time it should return new cloning object
		country.getStates().add("Andra Pradesh");
		
		// Should do a deep copy in constructor
		states.add("Maharashtra");
		
		System.out.println(country.getStates());
	}
}
