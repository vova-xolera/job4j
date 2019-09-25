package ru.job4j.loop;

public class Factorial {
        public static int calc(int n) {
            int result = 1;
                while (n != 0) {
                    result = result * n;
                    n--;
                }
            return result;
        }
}