package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class FI {
    public static void main(String[] args) {
        String[] atts = {
                new String("image 1"),
                new String("image 32"),
                new String("image 212")
        };
        Comparator<String> cmpSize = (left, right) -> left.compareTo(right);
        Comparator<String> cmpDescSize = (left, right) -> right.length() - left.length();
        Arrays.sort(atts, cmpDescSize);
        for (String att : atts) {
            System.out.println(att.toString());
        }
    }
}