package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int l = 0;
        int r = 0;
        while (l + r != right.length + left.length) {
            if (l < left.length && r < right.length) {
                if (left[l] < right[r]) {
                    rsl[r + l] = left[l];
                    l++;
                } else {
                    rsl[r + l] = right[r];
                    r++;
                }
            }
            else if (l == left.length) {
                rsl[r + l] = right[r];
                r++;
            }
            else {
                rsl[r + l] = left[l];
                l++;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}