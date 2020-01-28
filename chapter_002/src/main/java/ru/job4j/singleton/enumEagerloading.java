package ru.job4j.singleton;

import ru.job4j.tracker.Item;

public enum enumEagerloading {
    INSTANCE;

    public Item add(Item model) {
        return model;
    }

}
