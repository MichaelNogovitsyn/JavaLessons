import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Изоморфные слова

public class task5_2 {
    public static boolean isIsomorf(String strFirst, String strSecond) {
        Map<Character, Character> data = new HashMap<>();
        if (strFirst.length() != strSecond.length()) {
            return false;
        }
        for (int i = 0; i < strFirst.length(); i++) {
            if (data.containsKey(strFirst.charAt(i))) {
                if (data.get(strFirst.charAt(i)) == strSecond.charAt(i)) {

                } else {
                    return false;
                }
            } else {
                data.put(strFirst.charAt(i), strSecond.charAt(i));
            }
        }
        System.out.println(data);
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите первое слово");
        String strFirst = scn.nextLine();
        System.out.println("Введите второе слово");
        String strSecond = scn.nextLine();
        scn.close();
        System.out.println(isIsomorf(strFirst, strSecond));

    }
}
