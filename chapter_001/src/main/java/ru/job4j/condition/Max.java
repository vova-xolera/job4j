package ru.job4j.condition;

public class Max {
        public static int max(int first, int second) {
            int result = first <= second ? second : first;
            return result;
        }
        public static int max(int first, int second, int third) {
            int result = first <= max(second, third) ? max(second, third) : first;
            return result;
        }
        public static int max(int first, int second, int third, int forth) {
            int result = max(second, first) <= max(third, forth) ? max(third, forth) : max(second, first);
            return result;
        }
}