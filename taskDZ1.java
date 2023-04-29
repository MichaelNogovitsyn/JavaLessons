/* Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
Ввод:5
Треугольное число 1 + 2 + 3 + 4 + 5 = 15
n! 1 * 2 * 3 * 4 * 5 = 120 */

import java.util.Scanner;

public class taskDZ1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in, "Cp866");
        System.out.print("Enter number: ");

        int num = iScanner.nextInt();
        while (num < 1) {
            System.out.println("Enter number more then 0");
            num = iScanner.nextInt();
        }
        int i = 2;
        int sum = 1;
        int n = 1;
        System.out.print("Треугольное число 1");
        while (i <= num) {
            sum += i;
            System.out.printf(" + %d", i);
            i++;
        }
        System.out.printf(" = %d\n", sum);
        i = 1;
        System.out.print("n! 1");
        while (i <= num) {
            n *= i;
            System.out.printf(" * %d", n);
            i++;
        }
        System.out.printf(" = %d\n", n);
    }
}
