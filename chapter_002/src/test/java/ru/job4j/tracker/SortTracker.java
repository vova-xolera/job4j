package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortTracker {
    @Test
    public void aSort() {
        Tracker tracker = new Tracker();
       Item item1 = new Item("name1");
        Item item2 = new Item("name2");
        Item item3 = new Item("name3");
        Item item4 = new Item("name4");
        Item item5 = new Item("name5");

        tracker.add(item1);
        tracker.add(item3);
        tracker.add(item5);
        tracker.add(item2);
        tracker.add(item4);

        List<Item> items = Arrays.asList(
                item1,
                item2,
                item3,
                item4,
                item5
                );
        Collections.sort(tracker.findAll(), new AscendingSort());
        assertThat(tracker.findAll(), is(items));
    }

    @Test
    public void dSort() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("name1");
        Item item2 = new Item("name2");
        Item item3 = new Item("name3");
        Item item4 = new Item("name4");
        Item item5 = new Item("name5");

        tracker.add(item1);
        tracker.add(item3);
        tracker.add(item5);
        tracker.add(item2);
        tracker.add(item4);

        List<Item> items = Arrays.asList(
                item5,
                item4,
                item3,
                item2,
                item1
        );

        Collections.sort(tracker.findAll(), new DescendingSort());
        assertThat(tracker.findAll(), is(items));
    }
}