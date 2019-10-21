package ru.job4j.tracker;

import ru.job4j.tracker.animals.Item;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.parseInt(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            }

            else if (select == 1) {
                Item[] item = tracker.findAll();
                System.out.println("=== Id of Items ====");
                for (int i = 0; i < item.length; i++) {
                   System.out.println(item[i].getId());
                }
            }

            else if (select == 2) {
                System.out.println("=== Edit item ====");
                Item[] temp = tracker.findAll();
                System.out.println("Id of Items");
                if (temp.length == 0) {
                   System.out.println("At first add item");
                }
                else {
                    System.out.println("Enter Id");
                    String Id = scanner.nextLine();
                    boolean result = false;
                    for (int i = 0; i < temp.length; i++){
                        if (Id.equals(temp[i].getId())) {
                            System.out.println("Enter name");
                            String name = scanner.nextLine();
                            Item item = new Item(name);
                            result = tracker.replace(Id, item);
                        }
                    }
                    if (result) {
                        System.out.println("Operation completed");
                    }
                    else {
                        System.out.println("Error");
                    }
                }
            }

            else if (select == 3) {
                System.out.println("=== Delete item ====");
                System.out.println("Enter Id");
                String Id = scanner.nextLine();
                boolean result = tracker.delete(Id);
                if (result) {
                    System.out.println("Operation completed");
                }
                else {
                    System.out.println("Error");
                }
            }

            else if (select == 4) {
                System.out.println("=== Find item by Id ====");
                System.out.println("Enter Id");
                String Id = scanner.nextLine();
                Item item = tracker.findById(Id);
                System.out.println(" === name ====");
                System.out.println(item.getName());
                System.out.println(" === Id ====");
                System.out.println(item.getId());
            }

            else if (select == 5) {
                System.out.println("=== Find item by name ====");
                System.out.println("Enter name");
                String name = scanner.nextLine();
                Item[] item = tracker.findByName(name);
                if (item.length > 0) {
                    for (int i = 0; i < item.length; i++) {
                        System.out.println(" === name ====");
                        System.out.println(item[i].getName());
                        System.out.println(" === Id ====");
                        System.out.println(item[i].getId());
                    }
                }
                else {
                    System.out.println("Wrong name");
                }
            }

            else if (select == 6) {
                run = false;
            }
            else {
                System.out.println("Wrong number");
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}