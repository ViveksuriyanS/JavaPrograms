package com.basics.java;

import java.util.Scanner;

public class DataTypeSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numInps = sc.nextInt();
        for (int i = 0; i < numInps; i++) {
            try {
                long in = sc.nextInt();
                if (-Math.pow(2, 7) <= in && in <= Math.pow(2, 7) - 1)
                    System.out.println("* byte");
                if (-Math.pow(2, 15) <= in && in <= Math.pow(2, 15) - 1)
                    System.out.println("* short");
                if (-Math.pow(2, 31) <= in && in <= Math.pow(2, 31) - 1)
                    System.out.println("* int");
                if (-Math.pow(2, 63) <= in && in <= Math.pow(2, 63) - 1)
                    System.out.println("* long");
            } catch (Exception e) {
                System.out.println("Out of Range");
            }

        }

    }
}
