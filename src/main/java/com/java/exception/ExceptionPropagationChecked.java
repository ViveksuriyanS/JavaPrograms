package com.java.exception;

import java.io.IOException;
import java.io.PrintWriter;

public class ExceptionPropagationChecked {
    public static void main(String[] args) {
        try {
            method1(); // Caller already have try and catch, else we need throws method2()
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void method1() throws IOException { // Used because of method2()
        method2();
    }

    private static void method2() throws IOException { // If throws is used need to use in parent call method as well
        method3();
        throw new java.io.IOException("Device Error Method 2");
    }

    private static void method3() {
        try {
            throw new java.io.IOException("Device Error Method 3"); // Will get compile time error if not try catch
        } catch (IOException e) {
            e.printStackTrace();
        }
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
// Checked exception can be propagated
// Propagated Using throws keyword by providing about the information to the caller about Exception