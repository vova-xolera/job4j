package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int change = money - price;
        while (change != 0) {
            for (int coin : coins) {
                if (change - coin >= 0) {
                    rsl[size] = coin;
                    size++;
                    change = change - coin;
                    break;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
