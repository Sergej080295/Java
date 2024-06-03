package Seminars.Lesson_6.clinic.support;

public class Vaccination {

    public static String name;

    public Vaccination(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}