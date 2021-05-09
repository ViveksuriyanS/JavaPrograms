package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation2 {

	public static void main(String[] args) {
		// Initializing the array with values in sorted order
		int a[] = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22 };

		// Scanner object creation
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many times the array needs to be rotated");

		// Scanning the input from user that how many times array needs to be rotated
		int num = scan.nextInt();
		rotateArrayBetterSolution2(a, num);
		System.out.println(Arrays.toString(a));
		scan.close();
	}

	private static void rotateArrayBetterSolution2(int[] a, int num) {
		for (int i = 0; i < num; i++) {
			int tmp = a[0];
			int x;
			for (x = 0; x < a.length - 1; x++) {
				a[x] = a[x + 1];
			}
			a[x] = tmp;
		}
		System.out.println("___________");
		for (int ac : a)
			System.out.println(ac);
	}
}

// Juggling concept is confusing
