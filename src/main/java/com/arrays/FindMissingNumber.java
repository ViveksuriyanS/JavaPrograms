package com.arrays;

import java.util.Arrays;

public class FindMissingNumber {

	// a represents the array
	// n : Number of elements in array a
	static int getMissingNo(int a[], int n) {
		int total = 1;
		System.out.println(Arrays.toString(a));
		System.out.println(n);
		for (int i = 2; i <= (n + 1); i++) {
			System.out.println(i + "  " + total);
			total += i;
			System.out.println(total);
			total -= a[i - 2];
			System.out.println(total);
			System.out.println();
		}
		return total;
	}

	// Driver Code
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5 };
//		System.out.println(getMissingNo(arr, arr.length));
//		System.out.println(getMissintNum(arr, arr.length));
//		System.out.println(getMissingNumXOR(arr, arr.length));
		for (int i = 0; i < 9; i++) {
			System.out.println(i ^ (i + 1));
		}

	}

	private static int getMissingNumXOR(int[] arr, int length) {
		int x1 = arr[0];
		int x2 = 1;

		for (int i = 1; i < length; i++) {
			System.out.println(i + "   " + arr[i] + "   " + x1);
			System.out.println(x1 ^ arr[i]);
			x1 ^= arr[i];
			System.out.println(x1);
		}
		System.out.println();
		for (int j = 2; j <= length + 1; j++) {
			System.out.println(j + " " + x2);
			System.out.println(x2 ^ j);
			x2 ^= j;
			System.out.println(x2);
		}

		return (x1 ^ x2);
	}

	public static int getMissintNum(int[] arr, int n) {
		// Here n states the number of element in array -> 4
		// *******But along with the missing number the size is -> 5 ******** n = n+1
		// x=> 5+4+3+2+1 == 15
		int x = ((n + 1) * (n + 2)) / 2; // Actual formulae (n*(n+1))/2
		for (int i = 0; i < n; i++) {
			x -= arr[i]; // 15 - 1 => 14 - 2 => 12 - 3 => 9 - 5 => 4
		}

		return x;
	}
}