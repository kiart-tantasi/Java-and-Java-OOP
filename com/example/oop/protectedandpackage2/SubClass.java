package com.example.oop.protectedandpackage2;

import com.example.oop.protectedandpackage.SuperClass;

// this is to prove that you can access protected private attribute even it is different package
public class SubClass extends SuperClass {
    public void getProtectedData() {
        System.out.println(this.protectedData); // can access protected attribute
    }

    // cannot access package data from outside origin package
    // public void getPackageData() {
    // System.out.println(this.packageData);
    // }
}
