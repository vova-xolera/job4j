package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindItemByNameActionTest {

    @Test
    public void whenCheckOutput() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        Tracker tracker = new Tracker();
        Item item = new Item("fix bag");
        Item item2 = new Item("fix bag");
        tracker.add(item);
        tracker.add(item2);
        Item[] items = new Item[2];
        items[0] = item;
        items[1] = item2;
        new FindItemByNameAction(tracker, items);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("=== Find item by name ====")
                .add("Enter name ")
                .add(" === name ====")
                .add(items[0].getName())
                .add(" === id ====")
                .add(items[0].getId())
                .add(" === name ====")
                .add(items[1].getName())
                .add(" === id ====")
                .add(items[1].getId())
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }
}