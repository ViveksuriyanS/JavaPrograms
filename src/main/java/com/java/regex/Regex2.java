package com.java.regex;

import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[s]", "s")); // true [] only s
        System.out.println(Pattern.matches("[^s]", "s")); // false [] other than s
        System.out.println(Pattern.matches("[^s]", "a")); // true [] other than s
        System.out.println();

        // Small, Capital letters
        System.out.println(Pattern.matches("[a-z]", "h")); // true [a-z] small letter
        System.out.println(Pattern.matches("[A-Z]", "H")); // true [a-z] capital letter
        System.out.println(Pattern.matches("[a-zA-Z]", "H")); // true h or H  [a-z][A-Z] both small & capital letter
        System.out.println(Pattern.matches("[a-zA-Z0-9]", "3")); // true 3  [a-z][A-Z][0-9] both small,capital letter with numbers
        System.out.println(Pattern.matches("[a-z]", "sas")); // false single letter
        System.out.println(Pattern.matches("[a-d[m-z]]", "e")); // false [a-d][h-z] e,f,g not allowed
        System.out.println(Pattern.matches("[a-z&&[def]]", "e")); // false [a-z]&[def] only d,e,f intersection
        System.out.println(Pattern.matches("[a-z&&[^def]]", "e")); // false [a-z]&[def] except d,e,f Subtraction
        System.out.println();

        // Combinations
        System.out.println(Pattern.matches("[abc]?", "a")); // true ? zero or one time
        System.out.println(Pattern.matches("[abc]+", "aaabb")); // true + one or more time
        System.out.println(Pattern.matches("[abc]*", "aaabb")); // true * zero or more time
        System.out.println();

        // Size
        System.out.println(Pattern.matches("[abc]{2}", "ab")); // true {size} should match length of content abc
        System.out.println(Pattern.matches("[abc]{2}[0-9]{2}", "ab21")); // true {size}{size} should match length of content abc and 0-9
        System.out.println();

        // \\d -> digit \\D-> non-digit
        System.out.println(Pattern.matches("\\d", "9")); // true 9 is number
        System.out.println(Pattern.matches("\\d", "a")); // true a is not number
        System.out.println(Pattern.matches("\\D", "a")); // true a is non numerical
        System.out.println(Pattern.matches("\\D\\d", "a1")); // true combination of number and non number


        System.out.println();

    }
}
