package ru.job4j.tracker;

public class CreateAction implements UserAction {
    StubAction stubAction = new StubAction();

    private int position;

    private String[] menu = {
            "Add new Item",
            "Show all items",
            "Edit item",
            "Delete item",
            "Find item by id",
            "Find items by name",
            "Exit Program",
    };

    public String getMenuIndex(int index) {
        return this.menu[index];
    }

    public int getMenuStr(String str) {
        int result = 6;
        for (int i = 0; i < menu.length; i++) {
           if ((menu[i].equals(str))) {
               result = i;
              break;
           }
        }
        return result;
    }

    public void setPosition(int number) {
        this.position = number;
    }

    @Override
    public boolean execute(Input input, Tracker tracker, UserAction action) {
            boolean res = true;
            int number = getMenuStr(action.name());
            if (number == 0) {
                new CreateANewItem(input, tracker);
            } else if (number == 1) {
                new IdOfItems(tracker);
            } else if (number == 2) {
                new EditItem(tracker, input);
            } else if (number == 3) {
                new DeleteItem(tracker,input);
            } else if (number == 4) {
                new FindItemById(input, tracker);
            } else if (number == 5) {
                new FindItemByName(tracker, input);
            } else if (number == 6) {
                res = false;
            } else {
                System.out.println("Wrong number");
                res = false;
            }
            return res;

        }

    @Override
    public String name() {
        return getMenuIndex(position);
    }
}