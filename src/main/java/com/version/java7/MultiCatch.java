package com.version.java7;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            int Arr[] = new int[10];
            int a = 1/0;
            Arr[11] = a;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException ae) {
            ae.printStackTrace();
        }
    }
}

// In traditional way we have multi catch blocks to handle multiple exceptions
// In Java 7, we can club it in single block with '|' operator