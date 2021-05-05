package com.java.objects;

public class Test {

	public static void main(String[] args) {
		Person per =new Person();
		per.name = "John";
		per.age = 30;
		
		String st = String.valueOf(per);
		per.name = "Jane";
		per.age = 20;
		System.out.println(st);

	}

}

class Person {
	String name;
	int age;
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}