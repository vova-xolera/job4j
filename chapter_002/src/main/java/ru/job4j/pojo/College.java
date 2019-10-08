package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Vasia Pupkin");
        student.setGroup("8201");
        student.setReceipt(new Date());
        System.out.println(student.getName() + " study in group " + student.getGroup() + " since " + student.getReceipt());
    }
}
