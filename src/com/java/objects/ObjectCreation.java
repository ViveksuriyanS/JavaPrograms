package com.java.objects;

public class ObjectCreation {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		// With new we can create an object
		Object1 obj1 = new Object1();
		obj1.i = 5;
		try {
			Class<?> cls = Class.forName("com.java.objects.ObjectCreation");
			ObjectCreation obj = (ObjectCreation) cls.newInstance();
			System.out.println(obj.toString());
			System.out.println(cls.getName());
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
	}

}

class Object1 {
	int i;

	public Object1() {

	}
}