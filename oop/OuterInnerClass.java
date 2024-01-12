package oop;

public class OuterInnerClass {
    public static void main(String[] args) {

        class OuterClass {
            private String sayHi = "Hi !";

            public void saySomething() {
                System.out.println("Outer Class: Hi !");
            }

            class InnerClass { // can do static class in later version
                public void doSomething() {
                    System.out.println("Inner Class: " + sayHi); // Inner class can access outer class's private field
                }
            }
        }

        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        OuterClass.InnerClass innerShortcut = new OuterClass().new InnerClass();

        outer.saySomething();
        inner.doSomething();
        innerShortcut.doSomething();

    }
}
