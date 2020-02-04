package com.java.abstractidentifier;

public class AbstractClass extends Marriage {

	public static void main(String[] args) {
		AbstractClass ab = new AbstractClass();
		ab.marriedTo("Ranveer Singh", "Deepika Padukone");
		ab.marriedTo("Ajith Kumar", "Shalini");
		ab.inLove("Vijay Dev.", "Rashmika");
	}

	void marriedTo(String man, String woman) {
		System.out.println(man + " is married to " + woman);
	}
}

abstract class Marriage {
	abstract void marriedTo(String M, String F);

//	abstract void breakupWith(String M, String F);
	public void inLove(String M, String F) {
		System.out.println(M + " is in love with " + F);
	}
}

// By defining the class as abstract we can have the abstract/normal methods 
// Abstract methods are methods with only declaration (Without Definition)
// The method definition can be provided the class that extends the abstract class
