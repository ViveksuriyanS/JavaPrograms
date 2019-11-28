package com.java.polymorphism;

public class MethodOverride {

	public static void main(String[] args) {
		ParentClass parent = new ChildClass();
		parent.overrideable(6);
	}

}

class ParentClass {
	public void overrideable(int x) {
		System.out.println(x * 2);
	}
}

class ChildClass extends ParentClass {
	@Override
	public void overrideable(int x) {
		System.out.println(x * 3);
	}
}

// Override is runtime polymorphism