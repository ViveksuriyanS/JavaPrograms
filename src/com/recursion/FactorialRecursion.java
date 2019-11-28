package com.recursion;

import java.util.Scanner;

public class FactorialRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();

		System.out.println("The factorial of number " + input + " is " + recurseFactorial(input));
		scan.close();
	}

	public static int recurseFactorial(int i) {
		if (i == 1) {
			return 1;
		}
		return recurseFactorial(i - 1) * i;
	}

}

// Input : 5
// Output : 5*4*3*2*1 => 120