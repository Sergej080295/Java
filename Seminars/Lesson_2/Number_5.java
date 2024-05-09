/*
Задание 5
Напишите метод, который вернет содержимое текущей папки в виде массива строк. 
Напишите метод, который запишет массив, возвращенный предыдущим методом в файл. 
Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, 
оно должно записаться в лог-файл.

 */

package Seminars.Lesson_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Number_5 {
    private static Logger LOGGER = Logger.getLogger(Number_5.class.getName());

    public static void main(String[] args) {
        LOGGER.log(Level.INFO, "Приложение стартовало");
        String out = "C:\\Users\\milow\\Desktop\\Geek_Brains\\Java\\Seminars\\Lesson_2";
        writeFileNamesInFile("Number_5.txt", out);
    }

    private static void writeFileNamesInFile(String in, String out) {
        FileWriter fw = null;
        try {
            String outputPath = new File(out).getParent(); // Получаем путь к родительской папке
            fw = new FileWriter(outputPath + "\\" + in); // Создаем файл в родительской папке
            if (isThrowException()) {
                LOGGER.log(Level.SEVERE, "Возникла ошибка в методе записи: Тут должно быть ее подробное описание");
            }
            String[] arr = readFileNamesInDir(out);
            for (String s : arr) {
                fw.write(s + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                LOGGER.log(Level.SEVERE, e.getMessage(), e);
                throw new RuntimeException("Error closing file", e);
            }
        }
    }

    private static String[] readFileNamesInDir(String path) {
        File file = new File(path);
        if (file.isDirectory()) {
            if (isThrowException()) {
                LOGGER.log(Level.SEVERE, "Возникла ошибка в методе чтения: Тут должно быть ее подробное описание");
                // throw new RuntimeException("Возникла ошибка в методе чтения: Тут должно быть
                // ее подробное описание");
            }
            File[] files = file.listFiles();
            String[] names = new String[files.length];
            for (int i = 0; i < files.length; i++) {
                names[i] = files[i].getName();
            }
            return names;
        } else {
            throw new RuntimeException("File is not a directory");
        }
    }

    private static boolean isThrowException() {
        int a = 0;
        int b = 2;
        int digit = a + (int) (Math.random() * b);
        System.out.println(digit);
        return digit > 0;
    }
}