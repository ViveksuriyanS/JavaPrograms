package com.java.exception;

// Parent method doesn't throws Exception
// Child overridden method throws Exception
public class ParentYChildY {
    // void printX() throws Exception  -- Parent will have top parent level Exception
    void printX() throws ArithmeticException{ //
        System.out.println("In parent printX throws Child Level Exception");
    }
}

class ChildYY extends ParentYChildY {
    public static void main(String[] args) {
        ParentYChildY yy = new ChildYY();
        yy.printX();
    }
    // void printX() throws Exception  -- Compilation Error for Parent Exception of ArithmeticException
    void printX() throws ArithmeticException { // Child will have Child level Exception
        // void printX() Even if child class doesn't throw exception it will work
        System.out.println("In child printX throws Exception");
    }
}