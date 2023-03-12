import java.util.ArrayList;
import java.util.Arrays;

// Заполнить список названиями планет Солнечной системы
// в произвольном порядке с повторениями.
// вывести название каждой планеты и количество его повторений в списке.

public class task3_2 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(
                Arrays.asList("Merkury", "Mars", "Venus", "Earth", "Mars",
                        "Jupiter", "Venus", "Saturn", "Uranus", "Neptune", "Venus", "Pluto"));
        System.out.println(arr);
        int count = 1;

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i+1; j < arr.size(); j++) {
                if ((arr.get(i).equals(arr.get(j)))){
                    count++;
                    arr.remove(j);
                }
            }
            System.out.println(arr.get(i)+" "+count);
            count=1;
        }
        System.out.println(arr);
    }
}
