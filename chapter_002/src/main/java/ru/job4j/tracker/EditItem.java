package ru.job4j.tracker;

public class EditItem {

    EditItem(Tracker tracker, Input input) {
        System.out.println("=== Edit item ====");
        Item[] temp = tracker.findAll();
        System.out.println("id of Items");
        if (temp.length == 0) {
            System.out.println("At first add item");
        } else {
            String id = input.askStr("Enter id");
            boolean result = false;
            for (int i = 0; i < temp.length; i++) {
                if (id.equals(temp[i].getId())) {
                    String name = input.askStr("Enter name");
                    Item item = new Item(name);
                    result = tracker.replace(id, item);
                }
            }
            if (result) {
                System.out.println("Operation completed");
            } else {
                System.out.println("Error");
            }
        }
    }
}
