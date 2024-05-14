/*
 * Каталог товаров книжного магазина сохранен в виде двумерного
списка List<ArrayList<String>> так, что на 0й позиции каждого
внутреннего списка содержится название жанра, а на остальных
позициях - названия книг. Напишите метод для заполнения данной
структуры.
 */

package Seminars.Lesson_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Number_3 {
    static List<ArrayList<String>> books = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList proza = new ArrayList<>(List.of("proza", "Война и мир", "Буратино"));
        ArrayList poezia = new ArrayList<>(List.of("poezia", "Война и мир", "Буратино"));
        ArrayList skazki = new ArrayList<>();
        skazki.add("skazki");
        skazki.add("Маша и медведь");
        skazki.add("Красная шапочка");
        System.out.println(proza);
        System.out.println(poezia);
        System.out.println(skazki);
        books.addAll((Collection<? extends ArrayList<String>>) List.of(proza, poezia, skazki));
        System.out.println(books);
    }
}
