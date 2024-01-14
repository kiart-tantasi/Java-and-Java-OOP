package com.example.oop.enumtest;

public class App {
    public static void main(String[] args) {
        // get all values in enum
        for (final SomeEnum enu : SomeEnum.values()) {
            System.out.println(enu + " - " + enu.getNumber());
            enu.getNumber();
        }

        // new line
        System.out.println("\n");

        // declare enum var
        final SomeEnum someEnum = SomeEnum.FIRST;
        System.out.println(someEnum + " " + someEnum.getNumber());
    }
}
