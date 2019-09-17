package ru.job4j.condition;

import static java.lang.Math.pow;

public class SqArea {
    public static double square(int p, int k) {
        return k * pow(p,2) / (4 * (pow(k, 2) + 2 * k + 1));
    }

    public static void main(String[] args) {
        double result1 = square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
