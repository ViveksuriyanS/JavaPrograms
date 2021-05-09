package com.version.java8;

public class MethodReferences {

    MethodReferences() {
        System.out.println("You are in Constructor method");
    }

    public static void main(String[] args) {
        // Static method
        MethodReferencesInterface staticMethod = MethodReferences::staticMethod;
        staticMethod.say();

        // Instance method
        MethodReferences ref = new MethodReferences();
        MethodReferencesInterface ref1 = ref :: instanceMethod;
        ref1.say();

        // Constructor method
        MethodReferencesInterface ref2 = MethodReferences :: new;
        ref2.say();

    }
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