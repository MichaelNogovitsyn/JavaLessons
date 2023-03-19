import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

/* ; ; Пусть дан список сотрудников:
Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов

Написать программу, которая найдет и выведет повторяющиеся
имена с количеством повторений.
Отсортировать по убыванию популярности Имени.     */
/**
 * taskDZ5_2
 */
public class taskDZ5_2 {
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        ArrayList<String> persons = new ArrayList<>();
        LinkedHashMap<String, Integer> data = new LinkedHashMap<>();
        int count = 0;
        persons.add("Иван Иванов");
        persons.add("Светлана Петрова");
        persons.add("Кристина Белова");
        persons.add("Анна Мусина");
        persons.add("Анна Крутова");
        persons.add("Иван Юрин");
        persons.add("Петр Лыков");
        persons.add("Павел Чернов");
        persons.add("Петр Чернышов");
        persons.add("Мария Федорова");
        persons.add("Марина Светлова");
        persons.add("Мария Савина");
        persons.add("Мария Рыкова");
        persons.add("Марина Лугова");
        persons.add("Анна Владимирова");
        persons.add("Иван Мечников");
        persons.add("Петр Петин");
        persons.add("Иван Ежов");

        for (String person : persons) {
            String[] fio = person.split(" ");

            // System.out.println(fio[0]+" "+fio[1]);
            // System.out.println(fio);
            if (data.containsKey(fio[0])) {
                count = data.get(fio[0]) + 1;
                data.put(fio[0], count);
            } else {
                data.put(fio[0], 1);
            }
        }
        Map<String,Integer> sortedMap = data.entrySet().stream()
        .sorted(Comparator.comparingInt(e-> -e.getValue()))
        .collect(Collectors.toMap( 
            Map.Entry::getKey, 
            Map.Entry::getValue,
            (a,b) -> {
                throw new AssertionError();
            },
           LinkedHashMap::new));
        sortedMap.entrySet().forEach(System.out::println);

    }

}
