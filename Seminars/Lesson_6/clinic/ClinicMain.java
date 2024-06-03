package Seminars.Lesson_6.clinic;

import Seminars.Lesson_6.clinic.clients.Owner;
import Seminars.Lesson_6.clinic.patients.Animal;
import Seminars.Lesson_6.clinic.patients.impl.Cat;
import Seminars.Lesson_6.clinic.patients.impl.Dog;
import Seminars.Lesson_6.clinic.support.Vaccination;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ClinicMain {

    public static void main(String[] args) {

        Owner boris = new Owner(1, "Борис");

        Dog barbos = new Dog();

        Cat tom = new Cat(
                1L, "Tom",
                "siam",
                LocalDate.of(2023, 5, 13),
                new Owner(2, "Елена"), 13);

        List<Animal> patients = new ArrayList<>(List.of(barbos, tom));

        System.out.println(patients);

        System.out.println(barbos.getVaccinations());
        ///
        barbos.inject(new Vaccination("От чумки"));

        System.out.println(barbos.getVaccinations());

        barbos.inject(new Vaccination("столбняк"));

        System.out.println(barbos.getVaccinations());

        barbos.inject(new Vaccination("oajhgueghsa"));

        System.out.println(barbos.getVaccinations());

        Vaccination v = new Vaccination("СтолбнЯК");
        String s = Vaccination.name;

        System.out.println(s);

        // экземпляр класса Animal - конкретный представитель класса - шаблона

        /*
         * Aidar - 111, 222, 000
         * Alena - 777
         * Oleg - 2222, 87987, 54546, 548, 6549
         *
         * -> 1 класс User {name, List<Integer>}, 2 class Phonebook { Map }
         *
         * -> User - переопредилить 2 метода Object : equals и hashcode
         *
         * Phonebook -> addPhone(long), removePhone(long), printAll() ->
         *
         * Oleg - 2222, 87987, 54546, 548, 6549
         * Aidar - 111, 222, 000
         * Alena - 777
         *
         * ===
         * Comparator -> примеры кода с компаратором (google)
         */

    }

}