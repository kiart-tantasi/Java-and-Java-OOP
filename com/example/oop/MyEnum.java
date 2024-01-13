package com.example.oop;

enum SomeEnum {
    FIRST(1),
    SECOND(2),
    THIRD(3);
    public int number;
    // contructor for enum (cannot be `public`)
    // will get error if removed
    private SomeEnum(int number) {
        this.number = number;
    }
}

public class MyEnum {
    public static void main(String[] args) {
        // get all values in enum
        for (final SomeEnum enu : SomeEnum.values()) {
            System.out.println(enu + " - " + enu.number);
        }

        // new line
        System.out.println("\n");

        // declare enum var
        final SomeEnum someEnum = SomeEnum.FIRST;
        System.out.println(someEnum + " " + someEnum.number);
    }
}
