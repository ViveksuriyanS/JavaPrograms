package com.java.objects;

import java.util.ArrayList;

public final class Country {
	private final String countryName;
	private final ArrayList<String> states;

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
