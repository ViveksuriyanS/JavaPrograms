package com.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeDeserialize {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "Vivek", 26);
		String fileName = "Serialize_Deserialize.txt";
		// Serialization -> Converting Object to Bytes
		// OutputStream is used to write the stream of Bytes
		try {
			FileOutputStream fileStream = new FileOutputStream(fileName);
			ObjectOutputStream writeStream = new ObjectOutputStream(fileStream);
			writeStream.writeObject(emp1);
			writeStream.flush();// Empties the stream, more data can be written in stream
			writeStream.writeObject(emp1);
			writeStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// De-serialization -> Converting Bytes to Object
		// InputStream is used to read the Object Stream of Bytes to Object
		try {
			FileInputStream inputStream = new FileInputStream(fileName);
			ObjectInputStream readStream = new ObjectInputStream(inputStream);
			Employee empx1 = (Employee) readStream.readObject();
			System.out.println(empx1.toString()); // Calls the overridden toString method
			readStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	transient int age; // Transient variables will not be serialized and while de-serializing the value
						// will not be returned, instead default value will be returned
	int id;
	String name;

	Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "ID:" + this.id + " Name:" + this.name + " Age:" + age;
	}
}