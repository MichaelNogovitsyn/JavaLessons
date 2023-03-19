import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/* Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
что 1 человек может иметь несколько телефонов.
Добавить функции 1) Добавление номера
2) Вывод всего
Пример:
Я ввожу: 1
К: Введите фамилию
Я: Иванов
К: Введите номер
Я: 1242353
К: Введите 1) Добавление номера
2) Вывод всего
Я ввожу: 1
К: Введите фамилию
Я: Иванов
К: Введите номер
Я: 547568
К: Введите 1) Добавление номера
2) Вывод всего
Я: 2
Иванов: 1242353, 547568 */

public class taskDZ5_1 {
    public static void dasdsa(String args) {

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Map<String, Collection<Integer>> data = new HashMap<String, Collection<Integer>>();
        int select = 5;
        String surname = " ";
        int phoneNum = 0;

        while (true) {
            System.out.println("1 - добавить номер телефона\n2 - Вывести весь список\n0 - выход");
            select = scn.nextInt();
            if (select == 0)
                break;
            switch (select) {
                case 1:
                    System.out.println("Введите фамилию");
                    surname = scn.next();
                    System.out.println("Введите номер телефона");
                    phoneNum = scn.nextInt();
                    if (data.keySet().contains(surname)) {
                        data.get(surname).add(phoneNum);
                    } else {
                        data.put(surname, new ArrayList<Integer>());
                        data.get(surname).add(phoneNum);
                    }
                    break;
                case 2:
                    for (var item : data.entrySet()) {
                        System.out.println(item.getKey() + ": " + item.getValue());
                    }
                    System.out.println();
                    break;

                default:
                    break;
            }

        }
    }
}
