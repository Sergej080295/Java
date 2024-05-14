/*
 Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
 */

package Seminars.Lesson_1;

public class Number_5 {
    public static void main(String[] args) {
        String str = "Добро пожаловать на курс по Java";
        String[] arr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            String temp = arr[i];
            sb.append(temp).append(" ");
        }
        System.out.println(sb);
    }
}
