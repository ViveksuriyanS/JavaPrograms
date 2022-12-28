package com.java.string;

public class Z1_WordReverseSentense {

    public static void main(String[] args) {
        String st = "Hello My Name is Viveksuriyan";
        System.out.println(reverseEachWord(st));

    }

    private static String reverseEachWord(String st) {
        if (st == null || st.isEmpty()) {
            return st;
        }
        StringBuilder result = new StringBuilder();
        String[] arr = st.split(" ");
        int count = 0;
        for (String word : arr) {
            result.append(reverseUsingStringBuilder(word));
            count++;
            if (arr.length - 2 > count) // Not to add a space at last
                result.append(" ");
        }
        return result.toString();
    }


    private static String reverseUsingStringBuilder(String st) {
        StringBuilder stBuil = new StringBuilder(st);
        return stBuil.reverse().toString();
    }


}
