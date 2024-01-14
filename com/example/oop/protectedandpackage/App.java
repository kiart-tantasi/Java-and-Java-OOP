package com.example.oop.protectedandpackage;

public class App {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();

        // you can access public attribute in super class directly
        System.out.println(subClass.publicData);

        // but it will give error if you try to access private attribute
        // System.out.println(subClass.privateData) // causes error
        subClass.getProtectedData(); // so you have to use getter instead

        // package data can only access by class within same package
        subClass.getPackageData();
    }
}
