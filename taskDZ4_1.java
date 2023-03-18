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

public class taskDZ4_1 {

    public static LinkedList revers(LinkedList ll) {

        LinkedList newll = new LinkedList<>();
        int size = ll.size();
        for (int i = 0; i < size; i++) {
            newll.add(ll.pollLast());
        }
        return newll;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LinkedList<Integer> linList = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            linList.add(i);
        }
        System.out.println("LinkedList:");
        System.out.println(linList + "\n");
        linList = revers(linList);   
        System.out.println("Reversed LinkedList:");
        System.out.println(linList + "\n");   
    }
}
