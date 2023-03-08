import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/* Напишите метод, который составит строку, состоящую из 100 
повторений слова TEST и метод, который запишет эту строку в 
простой текстовый файл, обработайте исключения. */

public class task2_4 {
    public static void main(String[] args) {
        String str = "TEST";
        File file = new File("f.txt");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append(str);
        }
        try {
            FileWriter fr = new FileWriter(file, true);
            fr.write(sb.toString());
            fr.write("\n");
            fr.close();
        } 
        catch (IOException e) {
            System.out.println("Error");
        }
    }

}
