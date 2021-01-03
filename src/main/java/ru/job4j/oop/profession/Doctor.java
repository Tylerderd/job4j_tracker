package ru.job4j.oop.profession;

public class Doctor extends Profession {
    private boolean hasInternationalExperience;

    public Doctor(String name, String surname, String education, String birthday, boolean hasInternationalExperience) {
        super(name, surname, education, birthday);
        this.hasInternationalExperience = hasInternationalExperience;
    }

    public boolean isHasInternationalExperience() {
        return hasInternationalExperience;
    }

    public void healPeople() {

    }
}
