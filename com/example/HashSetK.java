package com.example;

import java.util.HashSet;

public class HashSetK {
    public static void main(String[] args) {

        HashSet<String> nameHashSet = new HashSet<>();

        nameHashSet.add("Dog");
        nameHashSet.add("Dog");
        nameHashSet.add("Dog");
        nameHashSet.add("Cat");
        nameHashSet.add("Cat");
        nameHashSet.add("Rabbit");

        System.out.println(nameHashSet);

        System.out.println("\nDoes it contain Rabbit? " + nameHashSet.contains("Rabbit"));

        System.out.println("\n");

        // for loop
        for (String str : nameHashSet) {
            System.out.println("For Each Loop: " + str);
        }

        // clear()
        // size()
    }
}
