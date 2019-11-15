package com.java.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedInputOutputStream {

	public static void main(String[] args) throws IOException {
		String filename = "InputOutputBuffer.txt";

		// Writing the data into the file
		FileOutputStream fileStream = new FileOutputStream(filename);
		// BufferedOutputStream is also used to write data into the file
		OutputStream outBuffer = new BufferedOutputStream(fileStream);
		String st = "Welcome to the real world... It sucks";
		byte[] b = st.getBytes();
		outBuffer.write(b);
		outBuffer.flush();
		outBuffer.close();

		// Reading the data from the file
		FileInputStream fileIStream = new FileInputStream(filename);
		InputStream inputStream = new BufferedInputStream(fileIStream);
		int i;
		while ((i = inputStream.read()) != -1)
			System.out.print((char) i);
		inputStream.close();

	}

}
