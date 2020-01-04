package ru.job4j.inheritance;


public class JSONReport extends TextReport {

    public String generate(String name, String body) {

       String  jsonString = "name : " + name + " " + "\n" + "body : " + body;
        return  jsonString;
    }

}
