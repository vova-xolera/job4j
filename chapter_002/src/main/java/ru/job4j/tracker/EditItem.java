package ru.job4j.tracker;

public class EditItem implements UserAction {

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Edit item ====");
        if (tracker.findAll().length == 0) {
            System.out.println("At first add item");
        } else {
            String id = input.askStr("Enter id ");
            String name = input.askStr("Enter name ");
            Item item = new Item(name);
            tracker.replace(id, item);
        }
        return true;
    }

    @Override
    public String name() {
        return "Edit item";
    }
}
