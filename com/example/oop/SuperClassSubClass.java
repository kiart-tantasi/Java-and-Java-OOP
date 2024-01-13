package com.example.oop;

public class SuperClassSubClass {
    public static void main(String[] args) {

        // Subclass extending SuperClass
        MySubClass mySubClass = new MySubClass();
        mySubClass.doSomething();
        mySubClass.doSomethingAbstract();

        // public vs protected attributes
        System.out.println("\n" + mySubClass.data);
        mySubClass.showProtectedData(); // cannot access with 'mySubClass.protectedData'

    }
}

abstract class MySuperClass {
    public String data = "public data from SuperClass";
    protected String protectedData = "protected data from SuperCLass";

    abstract public void doSomethingAbstract();

    public void doSomething() {
        System.out.println("SuperClass: I am studying English ! (not abstract)");
    }
}

class MySubClass extends MySuperClass {
    @Override
    public void doSomethingAbstract() {
        System.out.println("SubClass: I am learning Japanese ! (abstract)");
    }

    public void showProtectedData() {
        System.out.println(this.protectedData);
    }
}