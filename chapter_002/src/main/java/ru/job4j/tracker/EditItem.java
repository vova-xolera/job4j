package ru.job4j.tracker;

public class EditItem implements UserAction {

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Edit item ====");
        Item[] temp = tracker.findAll();
        System.out.println("id of Items");
        if (temp.length == 0) {
            System.out.println("At first add item");
        } else {
            String id = input.askStr("Enter id ");
            for (Item value : temp) {
                if (id.equals(value.getId())) {
                    String name = input.askStr("Enter name ");
                    Item item = new Item(name);
                    tracker.replace(id, item);
                }
            }
        }
        return true;
    }

    @Override
    public String name() {
        return "Edit item";
    }
}
