package com.example.oop.enumtest;

public enum SomeEnum {
    FIRST(1),
    SECOND(2),
    THIRD(3);

    private final int number;

    // contructor for enum (cannot be `public`)
    // will get error if removed
    private SomeEnum(int number) {
        this.number = number;
    }

    public Integer getNumber() {
        return this.number;
    }
}
