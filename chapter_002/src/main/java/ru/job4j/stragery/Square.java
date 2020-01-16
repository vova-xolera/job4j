package ru.job4j.stragery;

import java.util.StringJoiner;

public class Square implements Shape {
    public String draw() {
        String square = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
        .add("++++")
        .add("+  +")
        .add("+  +")
        .add("++++")
        .toString();
        return square;
    }
}
