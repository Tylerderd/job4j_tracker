package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Domarin Konstantin Alekseevich");
        student.setGroup(2);
        student.setAdmission(new Date());
        System.out.println(student.getFullName() + " joined group " + student.getGroup() + " at " + student.getAdmission());
    }
}
