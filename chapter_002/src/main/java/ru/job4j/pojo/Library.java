package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("1984", 264);
        Book second = new Book("Fahrenheit", 158);
        Book third = new Book("Brave new world", 300);
        Book forth = new Book("Clean code", 1);

        Book[] book = new Book[4];
        book[0] = first;
        book[1] = second;
        book[2] = third;
        book[3] = forth;

        for (int index = 0; index < book.length; index++) {
            Book temp = book[index];
            System.out.println(temp.getName() + " " + temp.getCount());
        }

        Book temp = book[0];
        book[0] = book[3];
        book[3] = temp;
        System.out.println("");
        System.out.println("Changing 0 and 3");

        for (int index = 0; index < book.length; index++) {
            temp = book[index];
            System.out.println(temp.getName() + " " + temp.getCount());
        }

        System.out.println("");
        System.out.println("Clean code printing");

        for (int index = 0; index < book.length; index++) {
            temp = book[index];
            if (temp.getName().equals("Clean code")) {
                System.out.println(temp.getName() + " " + temp.getCount());
            }
        }
    }
}
