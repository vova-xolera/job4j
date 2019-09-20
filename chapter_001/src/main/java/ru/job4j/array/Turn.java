package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        if (array.length % 2 == 0) {
            for (int index = 0;  index < array.length / 2; index++) {
                int temp = array[index];
                array[index] = array[array.length - 1 - index];
                array[array.length - 1 - index] = temp;
            }
        }
        else if (array.length % 2 != 0) {
            for (int index = 0;  index < (array.length - 1) / 2; index++) {
                int temp = array[index];
                array[index] = array[array.length - 1 - index];
                array[array.length - 1 - index] = temp;
            }
        }
        return array;
    }
}