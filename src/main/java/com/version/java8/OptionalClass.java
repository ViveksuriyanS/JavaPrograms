package com.version.java8;

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        String[] a = new String[10];
        try {
            String low = a[5].toLowerCase();
            System.out.println(low);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Hi");
        Optional<String> nullCheck = Optional.ofNullable(a[5]);
        if (nullCheck.isPresent()) {
            System.out.println(a[5]);
        } else {
            System.out.println("Not present");
        }
    }
}

// It is public final class
// Used to deal NullPointer Exception