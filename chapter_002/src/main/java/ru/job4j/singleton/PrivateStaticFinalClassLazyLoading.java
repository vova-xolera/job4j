package ru.job4j.singleton;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

public class PrivateStaticFinalClassLazyLoading {
    private Tracker tracker;


    public static Tracker getInstance() {
        return Holder.INSTANCE;
    }

    public Item add(Item model) {
        tracker.add(model);
        return model;
    }

    private static final class Holder {
        private static final Tracker INSTANCE = new Tracker();
    }

}
