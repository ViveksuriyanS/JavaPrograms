package com.java.io;

import java.io.IOException;

public class Basics {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter a character");
		// Reads a single character from the console
		int i = System.in.read();
		System.out.println(i);

	}
}
