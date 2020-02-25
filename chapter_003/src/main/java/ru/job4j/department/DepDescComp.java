package ru.job4j.department;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] o1Array = o1.split("/");
        String[] o2Array = o2.split("/");
        int length = Math.min(o1Array.length, o2Array.length);
        if (o1Array.length == 1 && o1Array[0].equals(o2Array[0])) {
            return o1Array[0].compareTo(o2Array[0]);
        }
        if (o2Array.length == 1 && o1Array[0].equals(o2Array[0])) {
            return o2Array[0].compareTo(o1Array[0]);
        }
        if (o1Array.length == 1) {
            return -1;
        }
        if (o2Array.length == 1) {
            return -1;
        }
        if (o1Array[0].equals(o2Array[0])) {
            for (int index = 1; index < length; index++) {
                if (o1Array[index].compareTo(o2Array[index]) != 0) {
                    return o2Array[index].compareTo(o1Array[index]);
                }
            }
            if (o1Array.length > length) {
                return o1Array.length - length;
            }
            if (o2Array.length > length) {
                return length - o2Array.length;
            }
        }
        return 0;
    }
}