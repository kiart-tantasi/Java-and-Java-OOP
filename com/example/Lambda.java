package com.example;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda {
    // just a helper to run lambda
    private final static String runLambdaSomewhereElse(SomeFnInterface fn, String fnParam) {
        return fn.run(fnParam);
    }

    // create a method that takes in a lambda
    private final static void runLambda(Consumer<String> consumer) {
        consumer.accept(null);
    }

    public static void main(String[] args) {
        final ArrayList<String> animalArrayList = new ArrayList<>();
        animalArrayList.add("Dog");
        animalArrayList.add("Cat");
        animalArrayList.add("Pig");

        // lambda expression
        // regular one
        animalArrayList.forEach(x -> {
            System.out.println(x);
        });
        // method reference or shorthand lambda expression
        animalArrayList.forEach(System.out::println);

        // assign lambda to a variable
        final Consumer<String> lambda = ((x) -> {
            System.out.println(x);
        });
        animalArrayList.forEach(lambda);

        // insert method into interface's method
        final SomeFnInterface fn = ((param) -> {
            return param;
        });

        // run a method that takes lambda as expression
        runLambda((param) -> {
            System.out.println("running lambda");
        });

        // [@FunctionInterface]
        // 1. use fn.run() directly
        System.out.println(fn.run("David 1"));
        // 2. create a method to run that lambda
        System.out.println(runLambdaSomewhereElse(fn, "David 2"));

        // lambda can take no param at all with interface Consumer<Void>
        // final Consumer<Void> consumerNoParam = ((v) -> {
        // System.out.println("do something without param, v is " + v); // v is always
        // null
        // });
    }
}

// interfaces to implement () kind of the same to Consumer
@FunctionalInterface
interface SomeFnInterface {
    String run(String name);
}
