package com.java.java8.stream;

public class Employee {
	String name;
	int salary;
	boolean isActive;

	Employee(String name, int salary, boolean isActive) {
		this.name = name;
		this.salary = salary;
		this.isActive = isActive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public boolean isActive(Employee emp) {
		return emp.isActive;
	}

}
