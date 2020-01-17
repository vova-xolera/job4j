package ru.job4j.tracker;

public class DeleteItem implements UserAction {

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Delete item ====");
        String id = input.askStr("Enter name ");
        boolean result = tracker.delete(id);
        if (result) {
            System.out.println("Operation completed");
        } else {
            System.out.println("Error");
        }
        return true;
    }

    @Override
    public String name() {
        return "Delete item";
    }
}
