import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class help {
    public static void main(String[] args) {
        float p = 123.3f;
        double d = 112.34d;
        char ch= '{';
        boolean flag =true;
        System.out.println("OK");

        byte b = Byte.parseByte("123");

        Scanner iScanner = new Scanner(System.in);
        int x = iScanner.nextInt();

        //-------------------------Массивы-------------------------\\
        int[] arr = new int[10];
        int arr2[];

        int[][] arr3 = new int[3][5];
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.println("%d",arr3[i][j]); 
            }
        }
        String[] splitStr = arr.split("\\D+");
        numbers[i] = Integer.parseInt(splitStr[i]);

        //------------------------Функции--------------------------------\\
        static int sum(int a, int b){
            return a+b;
        }
        //-------------------------Файлы--------------------------------\\\
        //import java.io.FileWriter;
        //import java.io.IOException;
        try (FileWriter fw = new FileWriter("file.txt",false)){
            fw.write("line1");
            fw.append("asd\n");
            fw.flush();               
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
          

