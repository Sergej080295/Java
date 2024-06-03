package Seminars.Lesson_6.clinic.patients.impl;

import Seminars.Lesson_6.clinic.clients.Owner;
//import Seminars.Lesson_6.clinic.patients.Animal;

import java.time.LocalDate;

public class Cat extends Seminars.Lesson_6.clinic.patients.Animal {

    public float height;

    public Cat(float height) {
        super();
        this.height = height;
    }

    public Cat(Long id, String name, String breed, LocalDate birthDate, Owner owner, float height) {
        super(id, name, breed, birthDate, owner);
        this.height = height;
    }



}