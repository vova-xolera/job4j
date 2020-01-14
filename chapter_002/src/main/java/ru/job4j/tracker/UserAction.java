package ru.job4j.tracker;

interface UserAction {

    boolean execute(Input input, Tracker tracker, UserAction action);

    String name();
}
