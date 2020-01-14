package ru.job4j.tracker;

public class FindItemByNameAction {
    public FindItemByNameAction(Tracker tracker, Item[] item) {
        System.out.println("=== Find item by name ====");
        System.out.println("Enter name ");
        if (item.length > 0) {
            for (Item value : item) {
                System.out.println(" === name ====");
                System.out.println(value.getName());
                System.out.println(" === id ====");
                System.out.println(value.getId());
            }
        } else {
            System.out.println("Wrong name");
        }
    }
}
