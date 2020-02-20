package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int length = Math.min(left.length(), right.length());
        for (int i = 0; i < length; i++) {
            int def = Character.compare(left.charAt(i), right.charAt(i));
            if (def != 0) {
                return def;
            }
        }
        if (left.length() - right.length() != 0) {
            return (left.length() - right.length());
        }
            return 0;

    }
}