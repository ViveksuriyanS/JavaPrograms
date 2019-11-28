package com.java.exception;

public class CustomException1 {

	public static void main(String[] args) {
		try {
			validateSalary(1600000);
		} catch (GreedyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void validateSalary(int salary) throws GreedyException {
		if (salary < 2000000) {
			System.out.println("Average Salary");
		} else {
			throw new GreedyException();
		}
	}

}

class GreedyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}