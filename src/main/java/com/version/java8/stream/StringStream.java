package com.version.java8.stream;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringStream {
    public static void main(String[] args) {
        String upperCase = "ABCDE";
        String lowerCase = "abcde";
        String camelCase = "Abcde";
        String onlyCharacter = "Abcde123";
        String password = "Abc123";
        String specialCharacter = "Abc123$";
        String identifier = "int*test"; // can start with $,_,a..z,A..Z,0..9 and no other special characters and space
        String rawString = "  Hey Hello, Focus  ";

        // Check UpperCase or LowerCase same method. Change the logic to lower case
        System.out.println(isUpperCase1(upperCase) ? "Uppercase" : "Not uppercase");
        System.out.println(isUpperCase2(upperCase) ? "Uppercase" : "Not uppercase");
        System.out.println(isUpperCase3(upperCase) ? "Uppercase" : "Not uppercase");

        // Check if the String contains only characters or Numbers
        System.out.println(checkString(onlyCharacter) ? "Only Character" : "Not only Characters");

        // Check if the string is a valid password with 1 small letter, 1 capital letter and a number
        System.out.println(checkPasswordComplex(password) ? "Valid Password" : "Incorrect Password");

        // Check for special character in String using both Character class and Regular Expression and Contains()
        System.out.println(checkSpecialCharacter(specialCharacter) ? "Contains Special Character" : "Doesn't contain special character");

        // Normalize and string to optimize the search
        System.out.println(normalizeString(rawString));


        // Check if java Identifier
        System.out.println(checkJavaIdentifier(identifier) ? "Identifier" : "Non-identifier");
    }

    private static String normalizeString(String rawString) {
        return rawString.toLowerCase(Locale.ROOT).trim().replace(",","");
    }

    private static boolean checkSpecialCharacter(String specialCharacter) {

        // Using contains()
        String specialChars = "~`!@#$%^&*()-_=+[{}]|\\;:'\",<.>/?";
        boolean specialCharacterFound = false;
        // Using Character Class
        int count = 0;
        for (char c : specialCharacter.toCharArray()) {
            if (!Character.isDigit(c) || Character.isLetter(c) || !Character.isWhitespace(c)) {
                count++;
            }
            if(specialCharacter.contains(String.valueOf(c))) {
                specialCharacterFound = true;
            }
        }

        System.out.println(specialCharacterFound ? "Found" : "Not Found");

        // Using Regular Expression
        Pattern pattern = Pattern.compile("[^a-z0-9]", Pattern.CASE_INSENSITIVE);
        Matcher match = pattern.matcher(specialCharacter);
        System.out.println(match.find() ? "Special Character" : "Non-special Character");



        if (count > 0) {
            return true;
        } else {
            return false;
        }


    }

    private static boolean checkPasswordComplex(String password) {
        return password.chars().anyMatch(c -> Character.isLowerCase(c)) // Predicate way of character stream
                && password.chars().anyMatch(Character::isUpperCase)
                && password.chars().anyMatch(Character::isDigit);
    }

    private static boolean checkJavaIdentifier(String input) {
        for (char c : input.toCharArray()) {
            Character.isJavaIdentifierPart(c);
            Character.isJavaIdentifierStart(c);
        }
        System.out.println(input.chars().allMatch(Character::isJavaIdentifierPart));
        return input.chars().allMatch(Character::isJavaIdentifierPart);
    }

    private static boolean checkString(String onlyCharacter) {
        return onlyCharacter.chars().allMatch(Character::isLetter);
    }

    // Using ASCII code
    // 0 - 48   to   9 - 57
    // A - 65   to   Z - 90
    // a - 97   to   z - 122
    public static boolean isUpperCase1(String input) {
        for (char c : input.toCharArray()) {
            if (65 <= c && c <= 90) {
                System.out.print((int) c + " ");
            } else {
                return false;
            }
        }
        return true;
    }

    // Using Character class
    public static boolean isUpperCase2(String input) {
        for (char c : input.toCharArray()) {
            // Character class provides multiple built-in functions
            // isUpperCase also accepts A - '\u00C0'  to Z - '\u00DE'
            if (Character.isUpperCase(c)) {
                System.out.print((int) c + " ");
            } else {
                return false;
            }

            if (Character.isLowerCase(c)) {
                System.out.println("Contains lower case in the Input");
            }
        }
        return true;
    }

    // Using Streams
    public static boolean isUpperCase3(String input) {
        // Character:: class provides multiple built-in functions
        return input.chars().allMatch(Character::isUpperCase);
    }
}
