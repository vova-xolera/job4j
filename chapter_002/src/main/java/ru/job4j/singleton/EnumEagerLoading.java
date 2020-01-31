package ru.job4j.singleton;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

public enum EnumEagerLoading {
    INSTANCE;
    private Tracker tracker;
    public Item add(Item model) {
        tracker.add(model);
        return model;
    }
}