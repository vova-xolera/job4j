package ru.job4j.tracker.professions;

public class Doctor extends Profession {
    private int experience;
    private int salary;
    public int getExperience() {
        return experience;
    }
    public int getSalary() {
        return  salary;
    }
    public void instruments(Dentist dentist) {
    }
}
