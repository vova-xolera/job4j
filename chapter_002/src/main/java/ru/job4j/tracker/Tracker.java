package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {

    private final Item[] items = new Item[100];
    private final static Random RN = new Random();
    private int position = 0;

    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextLong());
    }

    public boolean replace(String id, Item item) {
        boolean result = false;
        int index = indexOf(id);
            if (index != -1) {
                this.items[index] = item;
                item.setId(id);
                result = true;
            }
        return result;
    }

    public boolean delete(String id) {
        boolean result = false;
                int index = indexOf(id);
                if (index != -1) {
                    System.arraycopy(this.items, index + 1, this.items, index, this.position - index - 1);
                    result = true;
                    position--;
                }
        return result;
    }

    public Item[] findAll() {
        return Arrays.copyOf(this.items, this.position);
    }

    public  Item[] findByName(String key) {
        Item[] temp = new Item[this.position];
        int number = 0;
        for (int index = 0; index < this.position; index++) {
            if (key.equals(this.items[index].getName())) {
                temp[number] = this.items[index];
                number++;
            }
        }
        return Arrays.copyOf(temp, number);
    }

    public Item findById(String id) {
        int index = indexOf(id);
        if (index == -1) return null;
        else return items[index];
    }

    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }
}