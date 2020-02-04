package com.java.java8;

import java.util.Scanner;

public class SwitchFunctionString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter today's day");
		String day = scan.nextLine();
		switch (day) {
		case "Monday":
			System.out.println("Start of the week...");
			break;
		case "Tuesday":
		case "Wednesday":
		case "Thursday":
			System.out.println("Mid days of the week...");
			break;
		case "Saturday":
		case "Sunday":
			System.out.println("Weekend - Party time");
			break;

		default:
			System.out.println("Verify the day that you have entered");
		}
		scan.close();
	}

}

// From java8 switch supports String values as well
// Earlier only integer values can be used