import java.util.Scanner;

/* Напишите метод, который сжимает строку. 
Пример: вход aaaabbbcdd. */
public class task2_2 {

    public static void Collapse_string(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        // Char temp=str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                sb.append(str.charAt(i - 1));
                if (count > 1) {
                    sb.append(count);
                }
                count = 1;
            }
            if (i == (str.length() - 1)) {
                sb.append(str.charAt(i));
                if (count > 1) {
                    sb.append(count);
                }
            }
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Type string: ");
        String new_str = iScanner.next();
        Collapse_string(new_str);
    }
}
