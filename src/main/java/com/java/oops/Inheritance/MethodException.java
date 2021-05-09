package com.java.oops.Inheritance;

public class MethodException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void method1() throws Exception {

	}

}

class Child extends MethodException {
	@Override
	public void method1() throws ArithmeticException {
		System.out.println(1 / 0);
	}
}