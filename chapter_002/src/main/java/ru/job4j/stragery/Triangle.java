package ru.job4j.stragery;

public class Triangle implements Shape {
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("+++++++");
        pic.append("\n");
        pic.append(" +   +");
        pic.append("\n");
        pic.append("  + +");
        pic.append("\n");
        pic.append("   +");
        return pic.toString();
    }
}
