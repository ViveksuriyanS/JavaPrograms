package com.java.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {

	public static void main(String[] args) {
		FileWriter fileWrite;
		try {
			fileWrite = new FileWriter("ReaderWriter.txt");
			BufferedWriter bufferWrite = new BufferedWriter(fileWrite);
			bufferWrite.write("Hell is a word");
			bufferWrite.newLine();
			bufferWrite.write("Hello is also a word");
			bufferWrite.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

// Used to write data to file
// Fast Performance
// Inherit Writer class
// Efficient way to write array, String and chars

// BufferedWriter methods
// newLine() -> add new line
// write() -> writes the content
// flush() -> empty the buffer, but not closes the buffer
// close() -> closes the buffer