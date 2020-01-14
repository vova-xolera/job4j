package ru.job4j.tracker;

public class IdOfItems {

    public IdOfItems(Tracker tracker) {
        Item[] item = tracker.findAll();
        System.out.println("=== id of Items ====");
        for (int i = 0; i < item.length; i++) {
            System.out.println(item[i].getId());
        }
    }
}
