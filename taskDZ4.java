
/* *(ДОПОЛНИТЕЛЬНАЯ) +Задано уравнение вида q + w = e, q, w, e >= 0.
Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь).
Требуется восстановить выражение до верного равенства.
Предложить хотя бы одно решение или сообщить, что его нет.
Ввод: 2? + ?5 = 69
Вывод: 24 + 45 = 69 */

import java.util.Arrays;
import java.util.Scanner;

public class taskDZ4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter equation as: 2? + ?5 = 69");
        String equation = iScanner.nextLine();
        String[] splitStr = equation.split("\\D+");

        int[] numbers = new int[splitStr.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(splitStr[i]);
        }
        // System.out.print(Arrays.toString(numbers));

        int k = 0;
        int num_x = 0;
        int num1 = numbers[0];
        int num2 = numbers[1];
        int num3 = numbers[2];
        int result;
        boolean flag = false;
        while (k < numbers[2]) {

            result = (num1 * 10 + k) + (k * 10 + num2);
            if (result == num3) {
                num_x = k;
                flag = true;
                break;
            }
            k++;
        }
        if (flag) {
            System.out.printf("%d%d + %d%d = %d", num1, num_x, num_x, num2, num3);
        } else {
            System.out.println(" \n No solutions");
        }
    }
}
