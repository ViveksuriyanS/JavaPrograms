package com.version.java8;

public class DefaultMethod implements DefaultInterface{
    public static void main(String[] args) {
        // Interface => class
        DefaultInterface dI = new DefaultMethod();
        dI.printX();
        dI.sout();
        dI.sayHello();
        DefaultInterface.sayHi();

    }
    @Override
    public void sayHello() {
        System.out.println("Hello!");
    }
}
