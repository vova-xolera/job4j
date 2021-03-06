package ru.job4j.tracker;

import java.util.List;

public class FindItemByName implements UserAction {

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find item by name ====");
        String name = input.askStr("Enter name ");
        List<Item> item = tracker.findByName(name);
        if (item.size() > 0) {
            for (Item value : item) {
                System.out.println(" === name ====");
                System.out.println(value.getName());
                System.out.println(" === id ====");
                System.out.println(value.getId());
            }
        } else {
            System.out.println("Wrong name");
        }
        return true;
    }

    @Override
    public String name() {
        return "Find item by name";
    }
}
