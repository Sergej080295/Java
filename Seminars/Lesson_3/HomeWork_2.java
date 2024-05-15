package Seminars.Lesson_3;

/*
 * 
 */
import java.util.ArrayList;

class Answer {
    public static ArrayList<Integer> removeEvenNumbers(Integer[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 != 0) {
                result.add(num);
            }
        }
        return result;
    }
}

/* 
public class Printer{ 
    public static void main(String[] args) { 
        Integer[] arr = {};
        
        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                            .map(Integer::parseInt)
                            .toArray(Integer[]::new);
        }     
        
        ArrayList<Integer> result = Answer.removeEvenNumbers(arr);
        System.out.println(result);
    }
}
*/