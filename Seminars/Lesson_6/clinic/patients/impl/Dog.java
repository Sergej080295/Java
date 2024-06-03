package Seminars.Lesson_6.clinic.patients.impl;

import Seminars.Lesson_6.clinic.clients.Owner;
import Seminars.Lesson_6.clinic.patients.Animal;

import java.time.LocalDate;

public class Dog extends Animal {

    public Dog() {
        super();
    }

    public Dog(Long id, String name, String breed, LocalDate birthDate, Owner owner) {
        super(id, name, breed, birthDate, owner);
    }

}