package ru.job4j.condition;

public class Max {
        public static int max(int first, int second) {
            return first <= second ? second : first;
        }
        public static int max(int first, int second, int third) {
            return max(first, max(second, third));
        }
        public static int max(int first, int second, int third, int forth) {
            return max(max(second, first), max(third, forth));
        }
}