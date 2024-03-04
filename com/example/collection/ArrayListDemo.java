package com.example.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("dog");
        stringArrayList.add("cat");
        stringArrayList.add("something else");

        // for
        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println("For Loop: " + stringArrayList.get(i));
        }

        System.out.println("\n");

        // for each
        for (String str : stringArrayList) {
            System.out.println("For Each Loop: " + str);
        }

        System.out.println("\n" + stringArrayList.get(0));
        stringArrayList.set(0, "This item was changed");
        System.out.println(stringArrayList.get(0));

        java.util.ArrayList<String> integerArrayList = new java.util.ArrayList<>();
        integerArrayList.add("Front");
        integerArrayList.add("Middle");
        integerArrayList.add("Back");
        System.out.println("\nbefore item idx 0 deleted: " + integerArrayList.get(0));
        integerArrayList.remove(0);
        System.out.println("after item idx 0 deleted: " + integerArrayList.get(0));

        System.out.println("\nbefore clear: " + integerArrayList);
        System.out.println("size before clear: " + integerArrayList.size());
        integerArrayList.clear();
        System.out.println("after clear: " + integerArrayList);
        System.out.println("size after clear: " + integerArrayList.size());

        // sort
        ArrayList<Integer> integerArrayList1 = new ArrayList<>();
        integerArrayList1.add(5);
        integerArrayList1.add(1);
        integerArrayList1.add(3);

        System.out.println("\nbefore sorting: " + integerArrayList1);
        Collections.sort(integerArrayList1);
        System.out.println("after sorting: " + integerArrayList1);
    }
}

// ArrayList vs LinkedList (W3Schools.com)

// - How the ArrayList works -
// The ArrayList class has a regular array inside it. When an element is added,
// it is placed into the array.
// If the array is not big enough, a new, larger array is created to replace the
// old one and the old one is removed.

// - How the LinkedList works -
// The LinkedList stores its items in "containers." The list has a link to the
// first container and each container has a link to the next container in the
// list.
// To add an element to the list, the element is placed into a new container and
// that container is linked to one of the other containers in the list.

// ? When To Use ?
// Use an ArrayList for storing and accessing data
// and LinkedList to manipulate data.