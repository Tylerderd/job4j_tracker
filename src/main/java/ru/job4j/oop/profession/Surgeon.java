package ru.job4j.oop.profession;

public class Surgeon extends Doctor {
    private int yearsOfPractice;

    public Surgeon(String name, String surname, String education, String birthday, boolean hasInternationalExperience, int yearsOfPractice) {
        super(name, surname, education, birthday, hasInternationalExperience);
        this.yearsOfPractice = yearsOfPractice;
    }

    public int getYearsOfPractice() {
        return yearsOfPractice;
    }

    public void doSurgery() {

    }
}
