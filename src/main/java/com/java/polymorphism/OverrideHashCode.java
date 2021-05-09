package com.java.polymorphism;

public class OverrideHashCode {

	public static void main(String[] args) {
		Student st1 = new Student(101, "Vivek");
		Student st2 = new Student(101, "Vivek");

		// st1 and st2 are equals but when we use equals, returns false
		System.out.println(st1.equals(st2));
	}

}

class Student {
	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// To compare the value of an object we should override equals()
	@Override
	public boolean equals(Object o) {
		// Check for null
		if (o == null)
			return false;
		// Check for this instance check
		if (this == o)
			return true;

		if (o instanceof Student && ((Student) o).id == this.id && ((Student) o).name == this.name)
			return true;
		else
			return false;
	}

	@Override
	public int hashCode() {
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + id;
		return result;
	}
}

// Hashcode() is used to compare two java objects

// If equals() is overridden, then Hashcode should be overridden
// Must use same set of fields in both equals and hashcode
// If two objects are equal then their hashcode also should be equal