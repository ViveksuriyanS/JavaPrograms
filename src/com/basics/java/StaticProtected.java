/**/
package com.basics.java;

public class StaticProtected {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		C.swap(a, b);
		System.out.println(a + "  " + b);

	}

}

class C {
	protected static void  swap(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
	}
}