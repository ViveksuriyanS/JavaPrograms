package com.java.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileInputOutputStreamTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fileOutput = new FileOutputStream("fileTest.txt");
		ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput);
		outputStream.writeObject("Hello");
		outputStream.flush();
		outputStream.close();

		FileInputStream inputFile = new FileInputStream("fileTest.txt");
		ObjectInputStream inputStream = new ObjectInputStream(inputFile);
		System.out.println((String) inputStream.readObject());
		inputStream.close();
	}

}
