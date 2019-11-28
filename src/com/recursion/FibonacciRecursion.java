package com.recursion;

import java.util.Scanner;

public class FibonacciRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int maxSeries = scan.nextInt();
		for (int i = 0; i < maxSeries; i++) {
			System.out.print(recurseFibonacci(i) + " ");
		}
		scan.close();
	}

	public static int recurseFibonacci(int seriesNum) {
		if (seriesNum == 0) {
			return 0;
		}
		if (seriesNum == 1 || seriesNum == 2) {
			return 1;
		}

		return recurseFibonacci(seriesNum - 1) + recurseFibonacci(seriesNum - 2);
	}

}

// Input : 8
// 0  1  1  2  3  5  8  13