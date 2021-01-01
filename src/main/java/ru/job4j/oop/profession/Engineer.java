package ru.job4j.oop.profession;

public class Engineer extends Profession {

private String specialisation;
private boolean hasInternationalPassport;

    public String getSpecialisation() {
        return specialisation;
    }

    public boolean isHasInternationalPassport() {
        return hasInternationalPassport;
    }

    public int overWorkHours(int hours) {
        return -1;
    }
}
