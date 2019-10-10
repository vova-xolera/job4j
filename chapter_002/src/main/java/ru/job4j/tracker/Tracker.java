package ru.job4j.tracker;

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
        for(int index = 0; index < this.position; index++) {
          if (id.equals(this.items[index].getId())) {
              this.items[index] = item;
              result = true;
              break;
          }
        }
        return result;
    }

    public boolean delete(String id) {
        boolean result = false;
        for(int index = 0; index < this.position; index++) {
            if(this.items[index].getId().equals(id)) {
                if (index == this.position) {
                    this.items[index] = null;
                }
                else {
                    System.arraycopy(this.items, index + 1, this.items, index, this.position - index - 1);
                }
                result = true;
            }
        }
        return result;
    }

    Item[] findAll() {
        int number = 0;
        for (int index = 0; index < this.position; index++) {
            if (this.items[index] == null) {
               new Tracker().delete(this.items[index].getId());
               index--;
            }
            else {
                number++;
            }
        }
        Item[] array = new Item[number];
        if (number > 0) System.arraycopy(this.items,number - 1, array, number - 1, number);
        return array;
    }

    Item[] findByName(String key) {
        Item[] temp = new Item[this.position];
        int number = 0;
        for(int index = 0; index < this.position; index++) {
            if(key.equals(this.items[index].getName())) {
                temp[number] = this.items[index];
                number++;
            }
        }
        return temp;
    }

    Item findById(String id) {
        Item item = null;
        for(int index = 0; index < this.position; index++) {
            if(id.equals(this.items[index].getId())) {
                item = this.items[index];
                break;
            }
        }
        return item;
    }

}