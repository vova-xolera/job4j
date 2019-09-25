package ru.job4j.calculator;
/**
 * Package for calculate task.
 *
 * @author Vladimir Sedelnikov (sedelnik0v@yandex.ru)
 * @version 19.09.2019
 * @since 1.1
 */
public class Calculator {
    /**
     * Сложение
     * @param first первый аргумент
     * @param second второй аргумент
     * @return результат
     */
    public static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + " + " + second + " = " + result);
    }
    /**
     * Деление
     * @param first первый аргумент
     * @param second второй аргумент
     * @return результат
     */
    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + " / " + second + " = " + result);
    }
    /**
     * Умножение
     * @param first первый аргумент
     * @param second второй аргумент
     * @return результат
     */
    public static void multiply(double first, double second) {
        double result = first * second;
        System.out.println(first + " * " + second + " = " + result);
    }
    /**
     * Вычитание
     * @param first первый аргумент
     * @param second второй аргумент
     * @return результат
     */
    public static void subtrack(double first, double second) {
        double result = first - second;
        System.out.println(first + " - " + second + " = " + result);
    }
    /** Конструктор, проверка работоспособности вышеперчисленных методов
     *
     * @param args - args
     */
    public static void main(String[] args) {
       add(1, 2);
       div(3, 4);
       multiply(5, 6);
       subtrack(7, 8);
    }
}