package com.java.wrapperclass;

public class AutoboxingUnboxing {

	public static void main(String[] args) {
		// Integer Auto Boxing
		int i = 10;
		Integer i1 = new Integer(i);
		Integer i2 = Integer.valueOf(i);
		System.out.println("Autoboxing " + i1 + "  " + i2);

		// Integer Unboxing
		int i3 = i2.intValue();
		System.out.println("Value after Unboxing " + i3);

		// Character Auto-Boxing
		char c0 = 'c';
		Character c1 = new Character(c0);
		Character c2 = Character.valueOf('c');
		System.out.println("Autoboxing " + c1 + "  " + c2);

		// Integer Unboxing
		char c3 = c2.charValue();
		System.out.println("Value after Unboxing " + c3);

	}

}
