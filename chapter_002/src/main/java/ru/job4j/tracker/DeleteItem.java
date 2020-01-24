package ru.job4j.tracker;

public class DeleteItem implements UserAction {

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Delete item ====");
        String id = input.askStr("Enter id ");
        tracker.delete(id);
        return true;
    }

    @Override
    public String name() {
        return "Delete item";
    }
}
