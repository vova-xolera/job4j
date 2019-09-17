package ru.job4j.condition;

import static java.lang.StrictMath.sqrt;

public class TrgArea {
    public static double area(double a, double b, double c) {
       double halfPer = (a + b + c) / 2;
        return sqrt(halfPer * (halfPer - a) * (halfPer - b) * (halfPer - c));
    }


    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
