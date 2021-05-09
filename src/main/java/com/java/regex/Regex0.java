package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex0 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(".s");
        Matcher matcher = pattern.matcher("as");
        System.out.println(matcher.matches());

        boolean s = Pattern.compile("[a0-9]").matcher("b").matches();
        System.out.println(s);
    }
}
