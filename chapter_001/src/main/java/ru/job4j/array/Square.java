package ru.job4j.array;
import static java.lang.StrictMath.pow;

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < bound; i++) {
           rst[i] = (int) pow(i + 1, 2);
        }
        return rst;
    }
}