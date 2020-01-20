package ru.job4j.tracker;

public class FindItemById implements UserAction {

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find item by id ====");
        String id = input.askStr("Enter id ");
        Item item = tracker.findById(id);
        System.out.println(" === name ====");
        System.out.println(item.getName());
        System.out.println(" === id ====");
        System.out.println(item.getId());
        return true;
    }

    @Override
    public String name() {
        return "Find item by id";
    }
}
