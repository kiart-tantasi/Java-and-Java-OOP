package com.example;

import java.util.HashMap;

public class HashMapK {
    public static void main(String[] args) {

        HashMap<String, Person> personHashMap = new HashMap<>();
        personHashMap.put("John", new Person("John", 30));
        personHashMap.put("Anna", new Person("Anna", 36));

        // key iteration keySet()
        for (String key : personHashMap.keySet()) {
            System.out.println("Key: " + key);
            // Person person = personHashMap.get(key);
            // System.out.println("Value: " + person.name + " aged " + person.age);
        }

        // value iteration values()
        for (Person person : personHashMap.values()) {
            System.out.println("Value: " + person.name + " aged " + person.age);
        }

        System.out.println("\nSize: " + personHashMap.size());

    }
}

// HashMap vs Hashtable

// HashMap is async, while Hashtable is sync
// Hashmap works with multi-thread and thus not thread-safe while Hashtable
// allows only one thread at one time (thus thread-safe).
// HashMap has higher performance than Hashtable
// HashMap's key and value can be null while Hashtable can't (Null Pointer
// Exception).
// HashMap released in v 1.2(non-legacy) while Hashtable released in v
// 1.0(legacy).

// LinkedHashMap for predictable iteration order

class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}