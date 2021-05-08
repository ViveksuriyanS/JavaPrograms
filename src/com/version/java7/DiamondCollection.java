package com.version.java7;

import java.util.LinkedList;
import java.util.List;

public class DiamondCollection {
    public static void main(String[] args) {
        // Till java 6, we have to give the type in right side also
        List<String> stringList = new LinkedList<String>();
        // From Java 7, Diamond operator is enough
        List<String> stringList1 = new LinkedList<>();
        stringList.add("1");
        stringList1.add("1");

    }
}
