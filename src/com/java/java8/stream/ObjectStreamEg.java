package com.java.java8.stream;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ObjectStreamEg {

	public static void main(String[] args) {
		List<Employee> empList = new LinkedList<Employee>();
		empList.add(new Employee("Vivek", 18000, true));
		empList.add(new Employee("Suriya", 63000, true));
		empList.add(new Employee("Vishnu", 78000, false));
		empList.add(new Employee("Raj", 105000, true));
		empList.add(new Employee("Raj", 10500, false));
		// ----------------------- Old Way ------------------------
		// More to less => o2 - o1
		empList.sort((o1, o2) -> (o2.salary - o1.salary));
		// Less to more -> o1 - o2

		// Print first 2 employee with more salary
		for (int i = 0; i < 2; i++) {
			System.out.println(empList.get(i).name);
		}
		// ----------------------- Old Way ------------------------

		// ----------------------- New Way ------------------------
		System.out.println("New way");
		empList.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).limit(2).map(Employee::getName)
				.forEach(System.out::println);

		// Similar problem but if you want to display only employees who are active
		List<String> names = empList.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed())
				.filter(emp -> emp.isActive(emp)).limit(2).map(Employee::getName).collect(Collectors.toList());
		System.out.println(names);

		// Collectors can be collected as List,Set,Map
		// Set
		Set<String> names1 = empList.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed())
				.filter(emp -> emp.isActive(emp)).limit(2).map(Employee::getName).collect(Collectors.toSet());
		System.out.println(names1);

		// Map
		Map<String, Integer> names2 = empList.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed())
				.filter(emp -> emp.isActive(emp)).limit(2).collect(Collectors.toMap(ed -> ed.name, e -> e.salary));
		System.out.println(names2);

		// String
		String names4 = empList.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed())
				.filter(emp -> emp.isActive(emp)).limit(2).map(Employee::getName).collect(Collectors.joining(", "));
		System.out.println(names4);

		// Group by name -> but it should on employee's department
		Map<String, List<Employee>> names5 = empList.stream().collect(Collectors.groupingBy(e -> e.name));
		System.out.println(names5);

		// Count employee with same name, Count employees in each department
		Map<String, Long> names6 = empList.stream()
				.collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
		System.out.println(names6);

	}

}
