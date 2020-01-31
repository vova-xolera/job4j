package ru.job4j.singleton;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

public class StaticFinalFieldEagerLoading {
    private Tracker tracker;

        private static final Tracker INSTANCE = new Tracker();

        public static Tracker getInstance() {
            return INSTANCE;
        }

    public Item add(Item model) {
        tracker.add(model);
        return model;
    }

        public static void main(String[] args) {
            Tracker tracker = StaticFinalFieldEagerLoading.getInstance();
        }
}
