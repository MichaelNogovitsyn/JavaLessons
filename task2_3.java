import java.util.Scanner;

/* Напишите метод, который принимает на вход строку (String) и 
определяет является ли строка палиндромом (возвращает boolean значение). */

public class task2_3 {
    public static Boolean iSpolindrom(String str) {
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        String str = iScanner.next();
        System.out.println(iSpolindrom(str));
        iScanner.close();
    }
}
