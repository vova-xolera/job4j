package ru.job4j.loop;

public class Factirial {

        public static int calc(int n) {
            int result = 1;
                while(n != 0){
                    result = result * n;
                    n--;
                }
            return result;
        }
}