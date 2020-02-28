package ru.job4j.tracker;

/*
public class StartUI {

    private final Consumer<String> output;
    private final Input input;
    private final Tracker tracker;

    public StartUI(Input input, Tracker tracker, Consumer<String> output) {
        this.input = input;
        this.tracker = tracker;
        this.output = output;
    }

    public void init(Input input, Tracker tracker, Consumer<String> output) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ", actions.size());
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(Consumer<String> output) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.size(); index++) {
            System.out.println(index + ". " + actions.get(index).name());
        }
    }

     public static void main(String[] args) {
        Input validate = new ValidateInput(input);
        List<UserAction> actions = new ArrayList<>();
        actions.add(new CreateAction());
        actions.add(new FindAllAction());
        actions.add(new EditItem());
        actions.add(new DeleteItem());
        actions.add(new FindItemById());
        actions.add(new FindItemByName());
        actions.add(new ExitProgram());
        new StartUI().init(validate, tracker, actions);
    }
*/
//}