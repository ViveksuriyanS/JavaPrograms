package com.java.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamTest {

	public static void main(String[] args) {
		FileOutputStream fst;
		try {
			fst = new FileOutputStream("PrintStream.txt");
			PrintStream printStream = new PrintStream(fst);
			printStream.print("Hello String");
			printStream.print(123);
			printStream.print(false);
			printStream.close();
			int d = 12;
			String s = "String";
			System.out.printf("%d%s", d, s);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

// No need to .flush(), as it is handled automatically