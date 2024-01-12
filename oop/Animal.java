package oop;

public class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(this.name + ": I am making a sound");
    }
}
