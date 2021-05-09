package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation3 {

	public static void main(String[] args) {
		// Initializing the array with values in sorted order
		int a[] = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22 };

		// Scanner object creation
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many times the array needs to be rotated");

		// Scanning the input from user that how many times array needs to be rotated
		int num = scan.nextInt();
		rorateArrayJugglingSolution(a, num);
		System.out.println(Arrays.toString(a));

		scan.close();
	}

	private static void rorateArrayJugglingSolution(int[] arr, int d) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int i, j, k, temp;
		for (i = 0; i < findGCD(d, n); i++) {
			/* move i-th values of blocks */
			temp = arr[i];
			j = i;
			while (true) {
				k = j + d;
				if (k >= n)
					k = k - n;
				if (k == i)
					break;
				arr[j] = arr[k];
				j = k;
			}
			arr[j] = temp;
		}
		System.out.println("___________");
		for (int ac : arr)
			System.out.println(ac);

	}

	private static int findGCD(int numOfRotation, int inpLength) {
		if (inpLength == 0) {
			return numOfRotation;
		} else {
			return findGCD(inpLength, numOfRotation % inpLength);
		}
	}
}

// Juggling concept is confusing
