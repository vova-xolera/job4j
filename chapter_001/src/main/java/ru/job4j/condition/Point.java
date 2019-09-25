package ru.job4j.condition;

import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.sqrt;

public class Point {
    static double distance(int x1, int y1, int x2, int y2) {
        return sqrt(pow(x1 - x2, 2) + pow(y1 - y2, 2));
    }
    public static void main(String[] args) {
        double result = distance(2, 0, -1, 4);
        System.out.println("result (0, 2) to (2, 0) " + result);
    }
}
