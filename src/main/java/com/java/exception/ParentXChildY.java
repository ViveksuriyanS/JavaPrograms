package com.java.exception;

import java.io.IOException;

// Parent method doesn't throws Exception
// Child overridden method throws Exception
public class ParentXChildY {
    void printX() {
        System.out.println("In parent printX don't throws Exception");
    }
}

class ChildXY extends ParentXChildY {
    public static void main(String[] args) {
        ParentXChildY xy = new ChildXY();
        xy.printX();
    }
    // void printX() throws IOException  -- Compilation Error for Checked Exception
    void printX() throws RuntimeException {
        System.out.println("In child printX throws Exception");
    }
}