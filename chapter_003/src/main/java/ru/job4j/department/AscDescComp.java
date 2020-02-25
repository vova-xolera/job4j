package ru.job4j.department;

import java.util.Comparator;

public class AscDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] o1Array = o1.split("/");
        String[] o2Array = o2.split("/");
        if (o1Array.length == 1) {
            return -1;
        }
        if (o2Array.length == 1) {
            return  1;
        }
    return o1Array[0].compareTo(o2Array[0]);
    }
}
