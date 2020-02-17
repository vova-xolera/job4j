package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAddress().equals(key) || person.getName().equals(key) || person.getPhone().equals(key) || person.getSurname().equals(key)) {
                result.add(person);
            }
        }
        return result;
    }
}