package com.java.objects;

import java.util.ArrayList;

public final class Country { // Declare class as final
	private final String countryName; // Declare variables as private final
	private final ArrayList<String> states; // ditto

	// Only getter methods (no setters)

	public Country(String countryName, ArrayList<String> states) {
		this.countryName = countryName;

		// Creating Deep Copy for Mutable Object
		ArrayList<String> temp = new ArrayList<String>();
		for (String st : states) {
			temp.add(st);
		}
		this.states = temp;
	}

	public String getCountryName() {
		return countryName;
	}

	public ArrayList<String> getStates() {
		// Returning cloned object
		ArrayList<String> clonedObject = (ArrayList<String>) states.clone();
		return clonedObject;
	}

}
