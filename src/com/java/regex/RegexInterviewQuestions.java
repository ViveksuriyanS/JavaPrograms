package com.java.regex;

import java.util.regex.Pattern;

public class RegexInterviewQuestions {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));

        System.out.println("by character classes and quantifiers ...");
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));
        System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));

        System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));
        System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));
        System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));

        System.out.println("by metacharacters ...");
        System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949"));
        System.out.println(Pattern.matches("[789]{1}\\d{9}", "3853038949"));
    }
}

// 1. true, matches characters and also size
// 2. false, matches characters but not size
// 3. true, matches characters and size
// 4. false, doesn't match characters '$'

// 5. true, first 1-> '9' followed by 2-10 -> [0-9]
// 6. true

// 7. false, size doesn't match
// 8. false, start '8' doesn't match
// 9. true

// 10. true, first '8' followed by 9 digits
// 11. false