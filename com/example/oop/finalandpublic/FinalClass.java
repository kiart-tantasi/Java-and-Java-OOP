package com.example.oop;

final class CannotExtendsFinalClass {
    public void saySomething() {
        System.out.println("hello world !");
    }
    // cannot extend this class because of non-access modifier "final" (keyword)
    // if you try, you will get error
    // "The type Test cannot subclass the final class
    // CannotExtendsThisClassJava(16777529)"
}
