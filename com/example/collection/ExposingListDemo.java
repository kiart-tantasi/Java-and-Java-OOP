// run: java com/example/collection/ExposingListDemo.java

package com.example.collection;

import java.util.*;

public class ExposingListDemo {
    public static void main(String[] args) {
        System.out.println("EXPOSING");
        demoExposing();
        System.out.println("\nNOT-EXPOSING");
        demoNotExposing();
    }

    private static void demoExposing() {
        var itemList = new ArrayList<Item>();
        itemList.add(new Item(0));
        var list1 = new MyList(itemList);
        var list2 = new MyList(list1.getItemListExposing());
        // we meant to only add new item to list1
        list1.getItemListExposing().add(new Item(0));
        System.out.println("list1's size: " + list1.getItemListExposing().size());
        System.out.println("list2's size: " + list2.getItemListExposing().size());
        // but it also adds in list2
    }

    private static void demoNotExposing() {
        var itemList = new ArrayList<Item>();
        itemList.add(new Item(0));
        var list1 = new MyList(itemList);
        var list2 = new MyList(list1.getItemListNotExposing());
        list1.getItemListExposing().add(new Item(0));
        System.out.println("list1's size: " + list1.getItemListExposing().size());
        System.out.println("list2's size: " + list2.getItemListExposing().size());
        // list2's size is still 1 and list1's size is 2
    }
}

class MyList {
    private final List<Item> itemList;

    public MyList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public List<Item> getItemListExposing() {
        return this.itemList;
    }

    public List<Item> getItemListNotExposing() {
        return new ArrayList<>(itemList);
    }
}

class Item {
    private int value;

    public Item(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
