package ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Petr");
        list.add("Ivan");
        list.add("Stepan");
        for (String str : list) {
            System.out.println(str);
        }
    }
}
