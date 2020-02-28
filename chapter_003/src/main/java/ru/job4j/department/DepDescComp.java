package ru.job4j.department;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    public int compare(String left, String right) {
        int length = Math.min(left.length(), right.length());
        for (int i = 0; i < length; i++) {
            int def = Character.compare(right.charAt(i), left.charAt(i));
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