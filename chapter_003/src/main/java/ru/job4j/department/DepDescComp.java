package ru.job4j.department;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] leftArr = left.split("/");
        String[] rightArr = right.split("/");
        if ((leftArr.length == 1 || rightArr.length == 1) && leftArr[0].equals(rightArr[0])) {
                return leftArr.length - rightArr.length;
        }
        return leftArr[0].compareTo(rightArr[0]);
    }
}