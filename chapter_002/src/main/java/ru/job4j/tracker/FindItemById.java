package ru.job4j.tracker;

public class FindItemById implements UserAction {

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find item by id ====");
        if (tracker.findAll().size() == 0) {
            System.out.println("At first add item");
        }
        else {
            String id = input.askStr("Enter id ");
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(" === name ====");
                    System.out.println(item.getName());
                    System.out.println(" === id ====");
                    System.out.println(item.getId());
                }
                else {
                    System.out.println("Wrong id");
                }
            }
        return true;
    }

    @Override
    public String name() {
        return "Find item by id";
    }
}
