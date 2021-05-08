package com.java.exception;

public class ExceptionPropagationUnchecked {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void method1() {
        method2();
    }

    private static void method2() {
        method3();
    }

    private static void method3() {
        int x = 1/0; // Causing ArithmeticException
    }
}

// From main Method we call Method1
// Method1 calls Method2
// Method2 calls Method3
// Exception occur at Method 3
// Return back to Method 2
// Return back to Method 1
// Return back to main() where we have try{}... catch(e)...

// For Unchecked Exception, Propagation is handled automatically