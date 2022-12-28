package com.java.string;

public class CharacterAtEvenIndex {
    public static void main(String[] args) {
        String inputString = "HELLOA";
        System.out.println(checkAtEvenIndex(inputString, 'H'));
        System.out.println(checkAtEvenIndex(inputString, 'E'));
        System.out.println(checkAtEvenIndex(inputString, 'L'));
        System.out.println(checkAtEvenIndex(inputString, 'A'));
        System.out.println(checkAtEvenIndex(null, 'L'));
        System.out.println(checkAtEvenIndex("", 'L'));
    }

    private static boolean checkAtEvenIndex(String inputString, char keyword) {
        if(inputString == null || inputString.isEmpty()) {
            return false;
        }

        for (int i = 0; i < inputString.length(); i = i + 2) {
            if (inputString.charAt(i) == keyword) {
                return true;
            }
        }
        return false;
    }
}
