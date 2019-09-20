package ru.job4j.array;

public class MinDiapason {
    public  static int findMin(int[] data, int start, int finish) {
        int min = data[start];
        for (int index = start + 1; index <= finish; index++) {
            if (data[index] < data[index - 1]) min = data[index];
        }
        return  min;
    }
}
