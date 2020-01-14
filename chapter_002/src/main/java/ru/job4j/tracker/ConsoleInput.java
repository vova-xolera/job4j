package ru.job4j.tracker;

import java.util.Scanner;

public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String askStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    @Override
    public int askInt(String question) {
        return Integer.valueOf(askStr(question));
    }

    public CreateAction[] actions() {
        CreateAction[] act = new CreateAction[7];
        for (int number = 0; number < 7; number++) {
            CreateAction action = new CreateAction();
            act[number] = action;
            action.setPosition(number);
        }
        return act;
    }
}