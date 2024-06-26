/*
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;

class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;

    public static void sort(int[] mas) {
      SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        StringBuilder sb = new StringBuilder();
        Date date = new Date();
        int i = 0;
        boolean isSorted = true;
        while(isSorted) {
            sb.append(formater.format(date)).append(" ");
            isSorted = false;
            for (int j = 0; j < mas.length - 1 - i; j++) {
                if (mas[j] > mas[j + 1]) {
                    mas[j] ^= mas[j + 1];
                    mas[j + 1] ^= mas[j];
                    mas[j] ^= mas[j + 1];
                    isSorted = true;
                }
            }
            sb.append(Arrays.toString(mas));
            sb.append(System.lineSeparator());
            i++;
        }
        writeLog(sb);
    }

    public static void writeLog(StringBuilder str){
        try(FileWriter fw = new FileWriter("log.txt", false)) {
            fw.write(String.valueOf(str));
            fw.flush();
        } catch (Exception e) {
            System.out.println("Ошибка записи в файл");
        }
    }
  }

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
      int[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new int[]{9, 4, 8, 3, 1};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
      }     
      
      BubbleSort ans = new BubbleSort();      
      ans.sort(arr);

      try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
*/