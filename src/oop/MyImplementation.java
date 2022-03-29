package oop;

public class MyImplementation implements MyInterface {

    public String data;

    @Override
    public void doSomething() {
        System.out.println("I'm cleaning my house.");
    }

    @Override
    public String getData() {
        return data;
    }

    @Override
    public void setData(String data) {
        this.data = data;
    }
}
