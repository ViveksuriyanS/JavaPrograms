package com.version.java8;

public class LambdaExpression {
    public static void main(String[] args) {
        String input = "This is the message";

        // Normal way of using Interface by overriding method
        FunctionalInterfaceX inter = new FunctionalInterfaceX() {
            @Override
            public void printVal(String st) {
                System.out.println(st);
            }
        };
        inter.printVal(input);

        // Using Lambda Expression 1
        FunctionalInterfaceX inter1 = (st) -> {
            System.out.println(st);
        };
        inter1.printVal(input);

        // Using Lambda Expression 2
        FunctionalInterfaceX inter2 = st -> {
            System.out.println(st);
        };
        inter1.printVal(input);

        AddFuncInterface add = (a,b) -> a+b; // without return keyword or printing directly
        int out = add.add(4,8);
        System.out.println(out);
    }
}

