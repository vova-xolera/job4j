package ru.job4j.tracker;

public class CreateAction implements UserAction {

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        System.out.print("Enter name: ");
        String name = input.askStr("");
        Item item = new Item(name);
        tracker.add(item);
        return true;
    }

    @Override
    public String name() {
        return "Create a new Item";
    }
}