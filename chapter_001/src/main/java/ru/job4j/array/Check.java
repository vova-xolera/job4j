package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        int index = 1;
        while (index < data.length) {
          if (data[index] == data[index - 1]) {
              result = true;
              index++;
          }
          else {
              result = false;
              break;
          }
        }
        return result;
    }
}