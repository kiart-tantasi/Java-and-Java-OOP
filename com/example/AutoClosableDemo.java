package com.example;

public class AutoClosableDemo {
    public static void main(String[] args) {
        try (AutoClosableClass cl = new AutoClosableClass()) {
            System.out.println("inside try scope...");
        } catch (Exception e) {
            System.out.println("exception:: " + e.getMessage());
        }
    }

}

class AutoClosableClass implements AutoCloseable {
    public AutoClosableClass() throws Exception {
        // let's go with russian bullet
        if (Math.random() > 0.5) {
            throw new Exception("BOOM!");
        }
    }

    @Override
    public void close() throws Exception {
        System.out.println("on close");
    }
}
