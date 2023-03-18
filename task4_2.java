import java.util.LinkedList;
import java.util.Scanner;

/* // Реализовать консольное приложение,которое:
1. Принимает от пользователя строку вида text
2. Нужно сохранить текст в связный список */
public class task4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList linkList = new LinkedList<>();
        String text = new String();

        while(!(text.equals("stop"))){
            System.out.println("Enter some text: ");
            text = input.nextLine();
            int num=0;
            String strNum;
            if (text.contains("print")) {
                strNum = text.substring(6);
                num =Integer.parseInt(strNum );
                System.out.println(linkList.get(num));
                linkList.remove(num);
            } else {
                linkList.add(text);
            }
            System.out.println(linkList);
            
        }
        input.close();
    }
}
