package oop;

public class MySubClass extends MySuperClass {
    @Override
    public void doSomethingAbstract() {
        System.out.println("Subclass: Hello ! (abstract)");
    }

    public void showProtectedData() {
        System.out.println(this.protectedData);
    }
}
