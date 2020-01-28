package ru.job4j.singleton;

import ru.job4j.tracker.Item;

public class staticFieldLazyLoading {

        private static staticFieldLazyLoading instance;

        private staticFieldLazyLoading() {
        }

        public static staticFieldLazyLoading getInstance() {
            if (instance == null) {
                instance = new staticFieldLazyLoading();
            }
            return instance;
        }

        public Item add(Item model) {
            return model;
        }
}
