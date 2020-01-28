package ru.job4j.singleton;
import ru.job4j.tracker.Item;

public class privateStaticFinalClassLazyLoading {

        private privateStaticFinalClassLazyLoading() {
        }

        public static privateStaticFinalClassLazyLoading getInstance() {
            return Holder.INSTANCE;
        }

        public Item add(Item model) {
            return model;
        }

        private static final class Holder {
            private static final privateStaticFinalClassLazyLoading INSTANCE = new privateStaticFinalClassLazyLoading();
        }

}
