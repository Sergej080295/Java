/*
 Написать программу, которая попросит пользователя ввести <Имя> в консоли. 
Получит введенную строку и напечатает в консоль сообщение “Привет, <Имя>!”

В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида 
"Доброе утро, <Имя>!", если время от 05:00 до 11:59
"Добрый день, <Имя>!", если время от 12:00 до 17:59;
"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
 */


package Seminars.Lesson_1;

import java.time.LocalTime;
import java.util.Scanner;


public class Number_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();
        //System.out.println("Привет, " + name + "!");

        LocalTime currenTime = LocalTime.now();
        int hour = currenTime.getHour();

        String greeting;
        if (hour >= 5 && hour < 12) {
            greeting = "Доброе утро, " + name + "!";
        } else if (hour >= 12 && hour < 18) {
            greeting = "Добрый день, " + name + "!";
        } else if (hour >= 18 && hour < 23) {
            greeting = "Добрый вечер, " + name + "!";
        } else {
            greeting = "Доброй ночи, " + name + "!";
        }

        System.out.println(greeting);
    }
}
