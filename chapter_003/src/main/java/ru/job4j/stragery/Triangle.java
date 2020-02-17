package ru.job4j.stragery;

import java.util.StringJoiner;

public class Triangle implements Shape {
    public String draw() {
        String triangle = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
        .add("+++++++")
        .add(" +   +")
        .add("  + +")
        .add("   +")
        .toString();
        return triangle;
    }
}
