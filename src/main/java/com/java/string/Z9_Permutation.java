package com.java.string;

public class Z9_Permutation {

	public static void main(String[] args) {
		String st = "ABCD";

		permutation(st, 0, st.length() - 1);

	}

	private static void permutation(String st, int l, int r) {
		if (l == r) {
			System.out.println(st);
		} else {
			for (int i = l; i <= r; i++) {
				st = swap(st, l, i);
				permutation(st, l + 1, r);
				st = swap(st, l, i);
			}
		}
	}

	private static String swap(String st, int l, int i) {
		char tempArr[] = st.toCharArray();
		char tmp = tempArr[l];
		tempArr[l] = tempArr[i];
		tempArr[i] = tmp;

		return String.valueOf(tempArr);
	}

}
