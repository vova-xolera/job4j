package ru.job4j.singleton;

import ru.job4j.tracker.Item;

public class staticFinalFieldEagerLoading {

        private static final staticFinalFieldEagerLoading INSTANCE = new staticFinalFieldEagerLoading();

        private staticFinalFieldEagerLoading() {
        }

        public static staticFinalFieldEagerLoading getInstance() {
            return INSTANCE;
        }

        public Item add(Item model) {
            return model;
        }

        public static void main(String[] args) {
            staticFinalFieldEagerLoading tracker = staticFinalFieldEagerLoading.getInstance();
        }
}
