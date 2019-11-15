package com.java.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {
		FileReader file;
		try {
			file = new FileReader("ReaderWriter.txt");
			BufferedReader bufferRead = new BufferedReader(file);
			System.out.println(bufferRead.read());
			System.out.println(bufferRead.readLine());
			System.out.println(bufferRead.readLine());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
