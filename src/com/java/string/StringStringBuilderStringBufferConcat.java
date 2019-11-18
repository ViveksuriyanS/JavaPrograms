package com.java.string;

public class StringStringBuilderStringBufferConcat {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		StringConcat();
		System.out.println("Time taken by String : " + (System.currentTimeMillis() - startTime) + "ms");

		startTime = System.currentTimeMillis();
		StringBufferConcat();
		System.out.println("Time taken by String Buffer : " + (System.currentTimeMillis() - startTime) + "ms");

		startTime = System.currentTimeMillis();
		stringBuilderConcat();
		System.out.println("Time taken by String Builder : " + (System.currentTimeMillis() - startTime) + "ms");

	}

	private static void stringBuilderConcat() {
		StringBuilder stBuild = new StringBuilder(" ");
		for (int i = 0; i < 10000; i++) {
			stBuild.append("Hello");
		}
	}

	public static void StringConcat() {
		String inputString = " ";
		for (int i = 0; i < 10000; i++) {
			inputString = inputString + "Hello";
		}
	}

	public static void StringBufferConcat() {
		StringBuffer stBuff = new StringBuffer(" ");
		for (int i = 0; i < 10000; i++) {
			stBuff.append("Hello");
		}
	}

}
