package ru.job4j.department;

import java.util.Comparator;

public class AscDescComp implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] leftArr = left.split("/");
        String[] rightArr = right.split("/");
        if ((leftArr.length == 1 || rightArr.length == 1) && leftArr[0].equals(rightArr[0])) {
            return leftArr.length - rightArr.length;
        }
        if (rightArr[0].compareTo(leftArr[0]) == 0) {
            return right.compareTo(left);
        }
        return 0;
    }
}
