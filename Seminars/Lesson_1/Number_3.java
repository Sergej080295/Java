/*
 Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
 */

package Seminars.Lesson_1;

import java.util.Arrays;

public class Number_3 {
    public static void main(String[] args) {
        int[] arr = {1,4,5,4,7,8};

        // int[] arr1 = new int []{1,4,5,4,7,8};
        // int[] arr2 = new int[5];

        // System.out.println(Arrays.toString(arr1));
        // arr1[2] = 10;
        // System.out.println(Arrays.toString(arr1));
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            
        }
        System.out.println(sum);
    }
}
