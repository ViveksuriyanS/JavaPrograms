package com.inheritance;

public class InterfaceImplement implements InterfaceParent,InterfaceChild{
    public static void main(String[] args) {
        InterfaceParent obj = new InterfaceChild() {
            @Override
            public void print() {

            }
        };
    }

    @Override
    public void print() {

    }
}
