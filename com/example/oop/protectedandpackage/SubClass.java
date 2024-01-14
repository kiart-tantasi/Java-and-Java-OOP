package com.example.oop.protectedandpackage;

public class SubClass extends SuperClass {
    public void getProtectedData() {
        System.out.println(this.protectedData);
    }

    public void getPackageData() {
        System.out.println(this.packageData);
    }
}
