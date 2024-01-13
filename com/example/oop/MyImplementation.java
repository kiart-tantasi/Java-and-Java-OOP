package com.example.oop;

interface MyInterface {
    public void doSomething();
    public String getData();
    public void setData(String data);
}

public class MyImplementation {
    public static void main(String[] args) {
        // Implementation of Interface
        DummyImplementation myDemo = new DummyImplementation();
        myDemo.setData("My name is 'Data' !");
        System.out.println(myDemo.getData() + "\n");
    }

}

class DummyImplementation implements MyInterface {
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
