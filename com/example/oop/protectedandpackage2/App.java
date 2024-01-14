package com.example.oop.protectedandpackage2;

public class App {
    public static void main(String[] args) {
        final SubClass subClass = new SubClass();
        System.out.println(subClass.publicData);
        subClass.getProtectedData();
    }
}
