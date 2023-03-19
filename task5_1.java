import java.util.HashMap;
import java.util.Map;

/*Создать структуру для хранения Номеров паспортов и Фамилий сотудников 
 * организаций
 * 123456 Иванов
 * 321456 Васильев
 * 234432 Иванов
 * 654321 Петрова
 * 345678 Иванов
 * Вывести данные по сотрудникам с фамилией Иванов.
 */
public class task5_1 {
    public static void main(String[] args) {
        Map<Integer, String> data = new HashMap<>(10);
        data.put(123456, "Иванов");
        data.put(321456, "Васильев");
        data.put(234432, "Иванов");
        data.put(654321, "Петрова");
        data.put(345678, "Иванов");

        //for (var item : data.entrySet()) {
            for (Map.Entry<Integer,String> item : data.entrySet()) {
            if (item.getValue().equals("Иванов")) {
                System.out.println(item);
            }

        }
    }
}
