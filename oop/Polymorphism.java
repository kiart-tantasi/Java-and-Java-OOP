package oop;

import oop.Animal;

public class Polymorphism {
    public static void main(String[] args) {

        // SuperClass
        abstract class Animal {
            public String name;

            public Animal(String name) {
                this.name = name;
            }

            public void makeSound() {
                System.out.println(this.name + ": I am making a sound");
            }
        }

        // Dog
        class Dog extends Animal {
            public Dog(String name) {
                super(name);
            }

            public void makeSound() {
                System.out.println(this.name + ": Bowww...");
            }
        }

        // Cat
        class Cat extends Animal {
            public Cat(String name) {
                super(name);
            }

            public void makeSound() {
                System.out.println(this.name + ": Meawww...");
            }
        }

        Dog dog = new Dog("Jumbo");
        Cat cat = new Cat("Kitty");

        dog.makeSound();
        cat.makeSound();

        // cannot create new Animal() object because keyword "abstract"
        // Animal animal = new Animal("IAMANIMAL");
        // animal.makeSound();

    }

}
