package com.version.java8;

public class MethodReferences {

    MethodReferences() {
        System.out.println("You are in Constructor method");
    }

    public static void main(String[] args) {
        // Static method
        MethodReferencesInterface staticMethod = MethodReferences::staticMethod;
        MethodReferencesInterface staticMethod1 = MethodReferences::staticMethod; // Code reusable
        staticMethod.say();

        // Instance method
        MethodReferences ref = new MethodReferences();
        MethodReferencesInterface ref1 = ref :: instanceMethod;
        ref1.say();

        // Constructor method
        MethodReferencesInterface ref2 = MethodReferences :: new;
        ref2.say();

        MethodReferencesInterface sayMethod = () -> System.out.println("Hello"); // Direct implementation of Say()
    }
    // Static method Implementation
    public static void staticMethod() {
        System.out.println("You are in Static method");
    }

    public void instanceMethod() {
        System.out.println("You are in Instance method");
    }
}

// Lambda expression can be replaced with method Referencing

// 1. Static method
// 2. Instance method
// 3. Constructor

// Used to refer method in FunctionalInterface

// Note->
// If implementation of FunctionalInterface is present in class, then use Method Reference
// If implementation of FunctionalInterface Abstract method is not there, use Lambda Expression and implement method