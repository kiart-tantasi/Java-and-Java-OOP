package com.example;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MyLambda {
    public static void main(String[] args) {

        ArrayList<String> animalArrayList = new ArrayList<>();
        animalArrayList.add("Dog");
        animalArrayList.add("Cat");
        animalArrayList.add("Pig");

        // Lambda with forEach
        animalArrayList.forEach(x -> System.out.println(".forEach(): " + x));

        System.out.println("\n");

        // Lambda with forEach
        animalArrayList.forEach(x -> {
            System.out.println(".forEach() 2: " + x);
        });

        System.out.println("\n");

        // insert method into forEach
        Consumer<String> consumerLambdaMethod = x -> System.out.println(".forEach() 3: " + x);
        animalArrayList.forEach(consumerLambdaMethod);

        System.out.println("\n");

        // insert method into interface's method
        MyFunction sayHi = name -> "Hi ! " + name;
        String hiDavid = sayHi.runFunction("David.");
        System.out.println(hiDavid);

        System.out.println("\n");

        // ----- Lambda Techniques ----- //
        // 1
        doLambda(() -> System.out.println("What's up !"));

        System.out.println("\n");

        // 2
        Printable printMethod = () -> System.out.println("Printing Something");
        doLambda(printMethod);

        System.out.println("\n");

        // 3
        PrintableTakesString printableTakesString = (str) -> System.out
                .println(str + ": I am taking a string parameter.");
        doLambdaWithParam(printableTakesString);

        System.out.println("\n");

        // 4 (Last Example)
        StringReturnable stringReturnable = (String string) -> string;
        String strReturned = lambdaToReturnString(stringReturnable);
        System.out.println(strReturned);

    }

    static void doLambda(Printable sout) { // got to implement interface
        sout.print();
    }

    static void doLambdaWithParam(PrintableTakesString sout) { // got to implement interface
        sout.printWithString("Anna");
    }

    static String lambdaToReturnString(StringReturnable fn) {
        return fn.returnString("This is string returned.");
    }
}

// interfaces to implement

@FunctionalInterface
interface MyFunction {
    String runFunction(String name);
}

@FunctionalInterface
interface Printable {
    void print();
}

@FunctionalInterface
interface PrintableTakesString {
    void printWithString(String str);
}

@FunctionalInterface
interface StringReturnable {
    String returnString(String str);
}