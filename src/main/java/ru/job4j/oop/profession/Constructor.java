package ru.job4j.oop.profession;

public class Constructor extends  Engineer {

    private boolean hasDegree;
    private int workId;

    public Constructor(String name, String surname, String education, String birthday, String specialisation, boolean hasDegree, int workId) {
        super(name, surname, education, birthday, specialisation);
        this.hasDegree = hasDegree;
        this.workId = workId;
    }

    public boolean isHasDegree() {
        return hasDegree;
    }

    public int getWorkId() {
        return workId;
    }

    public void createMechanism() {

    }

}
