package ru.job4j.tracker;

interface UserAction {

    boolean execute(Input input, Tracker tracker);

    String name();
}
