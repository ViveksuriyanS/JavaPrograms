package com.java.exception;

public class CustomException {

	public static void main(String[] args) {
		try {
			validate(17);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void validate(int i) throws InvalidAgeException {
		if (i < 18) {
			throw new InvalidAgeException("Minor age");
		} else {
			System.out.println("Major - Eligible to vote");
		}

	}

}

@SuppressWarnings("serial")
class InvalidAgeException extends Exception {
	InvalidAgeException(String s) {
		super(s);
	}

}