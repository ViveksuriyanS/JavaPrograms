package com.version.java8;

public interface DefaultInterface {
    default void printX() {
        System.out.println("Hello");
    }
    default void sout() {
        System.out.println("Hello");
    }

    void sayHello(); // Abstract method

    // Static method
    static void sayHi() {
        System.out.println("Hi");
    }
}
// Lets say we have an interface X and it is being implemented in class A,B,C
// Now I want to add new method
// Then have to override the new method in Class A,B,C

// default method in interface is defined using keyword default
// default method is non abstract method
// Interface can have more than one default method
