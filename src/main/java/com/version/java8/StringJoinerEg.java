package com.version.java8;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringJoinerEg {
    public static void main(String[] args) {
        StringJoiner stJ = new StringJoiner(",");
        stJ.add("Hello");
        stJ.add("How are you !");
        System.out.println(stJ);

        StringJoiner stJ1 = new StringJoiner(",", "{","}");
        stJ1.add("Apple");
        stJ1.add("Banana");
        stJ1.add("Cherry");
        System.out.println(stJ1);

        String inp = "Hello,How are you!";
        StringTokenizer stT = new StringTokenizer(inp, ",");
        while (stT.hasMoreTokens()) {
            System.out.println(stT.nextToken());
        }
    }
}
