package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.animals.Item;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TestTracker {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1");
        tracker.add(previous);
        Item next = new Item("test2");
        next.setId(previous.getId());
        tracker.replace(previous.getId(), next);
    }
    @Test
    public void whenFindByNameAndFindById() {
        Tracker tracker = new Tracker();
        for (int index = 0; index < 100; index++) {
            Item item = new Item(index + "name");
            tracker.add(item);
        }
       Item[] temp = tracker.findByName("90name");
        String id = temp[0].getId();
        assertThat(tracker.findById(id).getName(), is("90name"));
    }


    @Test
    public void whenReplace89NumberOfArrayAndCheckResult() {
        Tracker tracker = new Tracker();
        for (int index = 0; index < 100; index++) {
            Item item = new Item(index + "name");
            tracker.add(item);
        }
        Item[] temp = tracker.findByName("90name");
        String id = temp[0].getId();
        Item item = new Item("check");
        assertThat(tracker.replace(id, item), is(true));
    }
}