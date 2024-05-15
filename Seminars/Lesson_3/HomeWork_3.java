package Seminars.Lesson_3;
/*
 * 
 */

 import java.util.Arrays;
 import java.util.ArrayList;
 import java.util.Collections;
 
 class Answer {
     public static void analyzeNumbers(Integer[] arr) {
         // Создаем список ArrayList и заполняем его числами из исходного массива arr
         ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
 
         // Сортируем список по возрастанию
         Collections.sort(list);
         System.out.println(list);
 
         // Находим минимальное и максимальное значения в списке
         int min = Collections.min(list);
         int max = Collections.max(list);
         System.out.println("Minimum is " + min);
         System.out.println("Maximum is " + max);
 
         // Находим среднее арифметическое значений списка
         double average = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
         System.out.println("Average is = " + average);
     }
 }
 
 /* 
 // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
 public class Printer {
     public static void main(String[] args) {
         Integer[] arr = {};
 
         if (args.length == 0) {
             // При отправке кода на Выполнение, вы можете варьировать эти параметры
             arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
         } else {
             arr = Arrays.stream(args[0].split(", "))
                     .map(Integer::parseInt)
                     .toArray(Integer[]::new);
         }
 
         Answer ans = new Answer();
         ans.analyzeNumbers(arr);
     }
 }
 */