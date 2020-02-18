package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> originSet = new HashSet<>(Arrays.asList(origin));
        HashSet<String> textSet = new HashSet<>(Arrays.asList(text));
        for (String str : textSet) {
            if (!originSet.contains(str)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}