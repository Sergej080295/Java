/*
 * Заполнить список десятью случайными числами.
Отсортировать список методом sort() и вывести его на экран.
 */

package Seminars.Lesson_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Number_1 {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        Random random = new Random(10);
        for (int i = 0; i < 10; i++) {
            intList.add(random.nextInt(0, 10));
        }
        System.out.println(intList);
        Collections.sort(intList);
        System.out.println(intList);
        System.out.println(Collections.max(intList));
    }
}
