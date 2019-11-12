package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation1 {

	public static void main(String[] args) {
		// Initializing the array with values in sorted order
		int a[] = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22 };

		// Scanner object creation
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many times the array needs to be rotated");

		// Scanning the input from user that how many times array needs to be rotated
		int num = scan.nextInt();
		rotateArrayBetterSolution1(a, num);
		System.out.println(Arrays.toString(a));

		scan.close();
	}

	private static void rotateArrayBetterSolution1(int[] a, int num) {
		int temp[] = new int[num];

		System.out.println("___________");
		for (int i = 0; i < num; i++) {
			temp[i] = a[i];
		}
		int index = 0;
		for (int ac : temp)
			System.out.println(ac);
		System.out.println("___________");
		for (int j = num; j < a.length; j++) {
			a[index] = a[j];
			index++;
		}
		for (int ac : a)
			System.out.println(ac);
		System.out.println("___________");
		for (int d = 0; d < temp.length; d++) {
			a[index] = temp[d];
			index++;
		}
		for (int ac : a)
			System.out.println(ac);
		System.out.println("___________");
	}
}

// Juggling concept is confusing
