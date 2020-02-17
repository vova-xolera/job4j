package ru.job4j.singleton;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

public class StaticFieldLazyLoading {
    private Tracker tracker;

    private static Tracker instance;

    public static Tracker getInstance() {
        if (instance == null) {
            instance = new Tracker();
        }
        return instance;
    }

    public Item add(Item model) {
        tracker.add(model);
        return model;
    }
}
