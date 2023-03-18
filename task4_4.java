import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class task4_4 {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
        Deque<String> queue = new LinkedList<String>();
        String text = new String();
        String temp =new String();

         while(!(text.equals("stop"))){
            System.out.println("Enter some text: ");
            text = input.nextLine();
            if (text.contains("print")) {
          while (!(queue.isEmpty())) {
            System.out.println(queue.pollLast());
          }
                
                
            break;  
            } else {
                queue.add(text);
            }
            System.out.println(queue);
            
        }input.close();
}
}
