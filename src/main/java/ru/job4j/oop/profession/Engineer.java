package ru.job4j.oop.profession;

public class Engineer extends Profession {

private String specialisation;
private boolean hasInternationalPassport;

    public Engineer(String name, String surname, String education, String birthday, String specialisation) {
        super(name, surname, education, birthday);
        this.specialisation = specialisation;
        this.hasInternationalPassport = isHasInternationalPassport();
    }

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
