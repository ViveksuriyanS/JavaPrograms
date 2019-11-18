package com.java.string;

public class StringBuilderX {

	public static void main(String[] args) {

		// Even though the stBuild is set a Final, the value is being changed
		final StringBuilder stBuild = new StringBuilder("InputA");
		stBuild.append(" InputB");
		System.out.println(stBuild);

		// insert at position -> No Deletion, Inserts in between
		stBuild.insert(3, "InputX");
		System.out.println(stBuild);

		// replace at position x to y -> Deletes and Inserts
		stBuild.replace(3, 10, "XYZZZ1112222");
		System.out.println(stBuild);

		// delete
		stBuild.delete(4, 9);
		System.out.println(stBuild);

		// Reverse
		stBuild.reverse();
		System.out.println(stBuild);
	}

}
