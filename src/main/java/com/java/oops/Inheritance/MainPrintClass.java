package com.java.oops.Inheritance;

public class MainPrintClass {

	public void printInterface(PrintInterface printer) {
		printer.print();
	}

	public static void main(String[] args) {
		MainPrintClass classX = new MainPrintClass();

		// Inline method definiion
		PrintInterface pi = () -> System.out.println("Hello WorldX");
		classX.printInterface(pi);
		
		PrintInterface pi1 = new PrintInterface() {
			
			@Override
			public void print() {
				System.out.println("Defining method");
				
			}
		};
		
		
	}

}
