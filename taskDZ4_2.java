/* Пусть дан LinkedList с несколькими элементами. 
Реализуйте метод(не void), который вернет “перевернутый” список.
Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя. */

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class taskDZ4_2 {

    public static void enqueue(LinkedList ll) {
        ll.add(ll.pollFirst());
    }

    public static Integer dequeue(LinkedList ll) {
        int element = (int) (ll.pollFirst());
        return element;
    }

    public static Integer first(LinkedList ll) {
        int element = (int) (ll.getFirst());
        return element;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;

        LinkedList<Integer> linList = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            linList.add(i);
        }
        System.out.println("LinkedList:");
        System.out.println(linList + "\n");

        int cmd = 5;
        while (cmd != 0) {
            System.out.println(
                    "Введите команду:\n0 - для выхода\n1 - помещает элемент в конец очереди\n2 - возвращает первый элемент из очереди и удаляет его\n3 - возвращает первый элемент из очереди, не удаляя");
            cmd = input.nextInt();
            switch (cmd) {
                case 0:
                    break;
                case 1:
                    enqueue(linList);
                    System.out.println("LinkedList:");
                    System.out.println(linList + "\n");
                    break;
                case 2:
                    number = dequeue(linList);
                    System.out.println(number);
                    System.out.println("LinkedList:");
                    System.out.println(linList + "\n");
                    break;
                case 3:
                    number = first(linList);
                    System.out.println(number);
                    System.out.println("LinkedList:");
                    System.out.println(linList + "\n");
                    break;
                default:
                    break;
            }
            if (cmd == 0) {
                break;
            }

        }
    }
}
