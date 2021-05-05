package com.java.regex;

import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
        // +ve case
        System.out.println(Pattern.matches(".s", "as")); // . means any character
        System.out.println(Pattern.matches("..s", "has")); // . means any character
        System.out.println(Pattern.matches("s.s", "sas")); // . means any character
        // -ve case
        System.out.println(Pattern.matches(".s", "sas")); // . means any character
        System.out.println(Pattern.matches("..s", "shas")); // . means any character
        System.out.println(Pattern.matches("s.s", "bas")); // . means any character

    }
}
