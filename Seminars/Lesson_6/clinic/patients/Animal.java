package Seminars.Lesson_6.clinic.patients;

import Seminars.Lesson_6.clinic.clients.Owner;
import Seminars.Lesson_6.clinic.support.Vaccination;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Animal {

    protected Long id;

    protected String name;

    protected String breed;

    protected LocalDate birthDate;

    private Owner owner;

    protected List<Vaccination> vaccinations = new ArrayList<>();

    public Animal() {
        this.id = -1L;
        this.name = "Animal";
        this.birthDate = LocalDate.now();
        this.owner = new Owner(-1L, "Test");
        this.breed = "дворовой";
    }

    // long str str locdate owner
    public Animal(Long id, String name, String breed, LocalDate birthDate, Owner owner) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.birthDate = birthDate;
        this.owner = owner;
    }

    public List<Vaccination> getVaccinations() {
        return vaccinations;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getName(long id) {
        return "abracadabra " + id;
    }

    public void inject(Vaccination v) {
        this.vaccinations.add(v);
    }

    @Override
    public String toString() {
        return name + " " + breed;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Animal animal = (Animal) o;
        return Objects.equals(id, animal.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}