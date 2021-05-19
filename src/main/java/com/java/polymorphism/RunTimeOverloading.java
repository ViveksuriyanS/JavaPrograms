package com.java.polymorphism;

import java.util.Arrays;

public class RunTimeOverloading {
    public static void main(String... args) {
        stringMethod("String");
        stringMethod("String", "String1");
    }

    // ... is varArgs
    static public void stringMethod(String... s) {
        System.out.println("String Array Input  -> " + Arrays.toString(s));
    }
}
