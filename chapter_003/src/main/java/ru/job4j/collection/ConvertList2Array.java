package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class ConvertList2Array {
    public static int[][] toArray(List<Integer> list, int cells) {
        int groups = (int) Math.ceil((double) list.size() / cells);
        int[][] array = new int[groups][cells];
        int row = 0, cell = 0;
        for (Integer num : list) {
            if (cells == cell) {
                cell = 0;
                row++;
            }
            array[row][cell] = num;
            cell++;
        }
        return array;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int index = 1; index <= 7; index++) {
            list.add(index);
        }
        int[][] rsl = toArray(list, 3);
        for (int[] row : rsl) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}