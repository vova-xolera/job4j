package ru.job4j.tracker;

public class DeleteItem {
    public DeleteItem(Tracker tracker, Input input) {
        System.out.println("=== Delete item ====");
        String id = input.askStr("Enter name");
        boolean result = tracker.delete(id);
        if (result) {
            System.out.println("Operation completed");
        } else {
            System.out.println("Error");
        }
    }
}
