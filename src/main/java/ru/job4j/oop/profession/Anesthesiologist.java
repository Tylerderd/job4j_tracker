package ru.job4j.oop.profession;

public class Anesthesiologist extends Doctor {
    private int syringe;
    private boolean accessToDrugs;

    public Anesthesiologist(String name, String surname, String education, String birthday, boolean hasInternationalExperience, int syringe, boolean accessToDrugs) {
        super(name, surname, education, birthday, hasInternationalExperience);
        this.syringe = syringe;
        this.accessToDrugs = accessToDrugs;
    }

    public int getSyringe() {
        return syringe;
    }

    public boolean isAccessToDrugs() {
        return accessToDrugs;
    }

    public void sleep(Patient patient) {

    }
}
