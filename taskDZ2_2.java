import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.io.*;
/* Дана строка (получение через обычный текстовый файл!!!)

"фамилия":"Иванов","оценка":"5","предмет":"Математика"
"фамилия":"Петрова","оценка":"4","предмет":"Информатика"

Написать метод(ы), который распарсит строку и, используя StringBuilder, 
создаст строки вида:
Студент [фамилия] получил [оценка] по предмету [предмет].

Пример вывода в консоль:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика. */

public class taskDZ2_2 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        String grades = "grades.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(grades))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] splitLine = line.split(":");
                String[] splitLine2 = Arrays.toString(splitLine).split(",");
                sb.append("Студент"+splitLine2[1]+"\n");
                System.out.println(Arrays.toString(splitLine2));               
            }
            System.out.println(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
