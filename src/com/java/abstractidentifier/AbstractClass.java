package com.java.abstractidentifier;

public class AbstractClass extends Marriage{

	public static void main(String[] args) {
		AbstractClass ab = new AbstractClass();
		ab.marriedTo("Ranveer Singh","Deepika Padukone");
		ab.marriedTo("Ajith Kumar","Shalini");
	}

	void marriedTo(String man, String woman) {
		System.out.println(man + " is married to " + woman);
	}
}

abstract class Marriage {
	abstract void marriedTo(String M, String F);
//	abstract void breakupWith(String M, String F);
	public void inLove(String M, String F) {
		System.out.println("Rashmika is in love with Vijay Dev.");
	}
}

// By defining the class as abstract we can define the 
