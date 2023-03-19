import java.util.Stack;
import java.util.Scanner;

/*Написать программу , определяющюю правильность расстановки скобок в выражении. 
 * a+(d*3)
 * [a+(1*3)
 * [a+(3*3)]
*/
public class task5_3 {
    public static boolean rightInput(String str) {
        Character aL = '[';
        Character aR = ']';
        Character bL = '(';
        Character bR = ')';
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            if (str.charAt(i) == '[') {
                stack.add('[');
                System.out.println("Stack=" + stack);
            }
            if (str.charAt(i) == '(') {
                stack.add('(');
                System.out.println("Stack=" + stack);
            }
            if ((str.charAt(i) == ']') && (stack.peek() == '[')) {
                stack.removeElement('[');
                System.out.println("Stack=" + stack);
            }
            if ((str.charAt(i) == ')') && (stack.peek() == '(')) {
                stack.removeElement('(');
                System.out.println("Stack=" + stack);
            }

        }
        System.out.println("Stack=" + stack);

        return stack.empty();

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Введите выражение");
        String brackets = scn.nextLine();
        System.out.println(rightInput(brackets));
    }
}
