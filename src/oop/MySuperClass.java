package oop;

public abstract class MySuperClass {
    public String data = "public data from SuperClass";
    protected String protectedData = "protected data from SuperCLass";

    abstract public void doSomethingAbstract();

    public void doSomething() {
        System.out.println("SuperClass: I am studying English !");
    }
}
