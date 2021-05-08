package com.version.java7;

public class SwitchString {
    public static void main(String[] args) {
        String in = "Hi";
        // Till Java 6, only Integer and Characters are allowed

        switch (in) {
            case "Hi":
                System.out.println("Hello");
                break;
            case "Bye":
                System.out.println("See you later");
                break;
            default:
                break;
        }
    }
}
