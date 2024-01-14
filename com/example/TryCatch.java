package com.example;

public class TryCatch {
    public static void main(String[] args) {

        int age = 15; // try 15 25 35

        try {
            if (age < 20)
                throw new ArithmeticException("Your age is under 20.");
            else if (age < 30)
                throw new IllegalStateException("Your age is 20 or older but is less than 30.");
            else
                System.out.println("Your age is 30 or older !");
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (IllegalStateException e) {
            System.out.println(e);
        } finally {
            System.out.println("DONE.");
        }

    }
}
