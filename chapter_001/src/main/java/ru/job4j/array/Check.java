package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
        boolean temp = data[0];
        int index = 1;
        while (index < data.length) {
          if (data[index] =! temp) {
              result = false;
              break;
          }
            index++;
        }
        return result;
    }
}