package com.example.oop;

public class SuperClassSubClass {
    public static void main(String[] args) {
        // Subclass extending SuperClass
        MySubClass subClass = new MySubClass();
        subClass.doSomething();
        subClass.doSomethingAbstract();

        // public vs protected attributes
        subClass.showPublicData();
        subClass.showProtectedData(); // cannot access with 'mySubClass.protectedData'
    }
}

abstract class MySuperClass {
    public String publicData = "public data";
    protected String protectedData = "protected data";

    abstract public void doSomethingAbstract();

    public void doSomething() {
        System.out.println("not abstract method");
    }
}

class MySubClass extends MySuperClass {
    public void doSomethingAbstract() {
        System.out.println("abstract method");
    }

    public void showProtectedData() {
        System.out.println(this.protectedData);
    }

    public void showPublicData() {
        System.out.println(this.publicData);
    }
}
