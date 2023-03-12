import java.util.ArrayList;
import java.util.Arrays;

// Пусть дан произвольный список целых чисел, удалить из него чётные числа
public class taskDZ3_1 {
    static public void RemoveEven(ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            if ((array.get(i)) % 2 == 0) {
                array.remove(i);
            }
        }
    }
    public static void main(String[] args) {
        ArrayList list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(list);
        RemoveEven(list);
        System.out.println(list);
    }
}
