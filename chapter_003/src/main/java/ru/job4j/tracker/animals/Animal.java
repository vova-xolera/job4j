package ru.job4j.tracker.animals;

public class Animal {
    public Animal() {
        System.out.println("Animal");
    }

    public Animal(String name) {
     System.out.println(name);
    }
    public static void main(String[] args) {
        Tiger kisa = new Tiger("name");
    }
}
