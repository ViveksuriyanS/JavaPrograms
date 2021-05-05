package com.java.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter regex pattern:");
            Pattern pattern = Pattern.compile(sc.nextLine());
            System.out.println("Enter sentence");
            Matcher matcher = pattern.matcher(sc.nextLine());

            boolean found = false;
            while (matcher.find()) {
                System.out.println("Found " + matcher.group() + " starting at index " + matcher.start() + " ends at " + matcher.end());
                found = true;
            }
            if (found) {
                break;
            } else {
                System.out.println("Match not found...");
            }
        }
    }
}


//        Enter regex pattern:
//        Hello
//        Enter text
//        Hey Hi There won't you say Hello
//        Found Hello starting at index 27 ends at 32