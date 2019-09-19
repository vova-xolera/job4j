package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int finish) {
            boolean prime = finish != 1;
            for (int i = finish - 1; i > 1; i--) {
                if (finish % i == 0) {
                    prime = false;
                    break;
                }
            }
            return prime;
    }
}
