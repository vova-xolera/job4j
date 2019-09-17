package ru.job4j.calculator;

import sun.awt.geom.AreaOp;

public class Calculator {
    public static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + " + " + second + " = " + result);
    }
    public static void div (double first, double second) {
        double result = first / second;
        System.out.println(first + " / " + second + " = " + result);

    }

    public static void multiply (double first, double second) {
        double result = first * second;
        System.out.println(first + " * " + second + " = " + result);

    }

    public static void subtrack (double first, double second) {
        double result = first - second;
        System.out.println(first + " - " + second + " = " + result);

    }

    public static void main(String[] args) {
       add(1,2);
       div(3,4);
       multiply(5,6);
       subtrack(7,8);
    }
}
