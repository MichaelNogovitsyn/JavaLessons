
/* Реализовать простой калькулятор (+ - / *)
Ввод числа ->
Ввод знака ->
Ввод числа -> 
3*дополнительно. К калькулятору из предыдущего дз добавить логирование.
1 + 3 = 4
4 + 3 = 7 */
import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.*;
import java.util.logging.FileHandler;

public class taskDZ4_3 {

    private static Logger logger = Logger.getLogger(taskDZ4_3.class.getName());
    FileHandler fh = new FileHandler("log.txt");

    public static void main(String[] args) throws IOException {
        FileHandler fh = new FileHandler("log.txt", true);
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        logger.log(Level.INFO, "Start");
        Deque dl = new LinkedList<>();

        Scanner iScanner = new Scanner(System.in);
        System.out.print(" Enter number: ");
        double num1 = iScanner.nextInt();
        logger.log(Level.INFO, "User input number1: " + num1);
        double result = 0;
        String operation=" ";
        System.out.print(" cancel - отмена, q - выход\n");

        while (!(operation.equals("q"))) {        
            System.out.print(" Enter operation: ");
            operation = iScanner.next();
            if (!((operation.equals("cancel"))|(operation.equals("q")))) 
            {
                System.out.print(" Enter number2: ");
                double num2 = iScanner.nextInt();
                logger.log(Level.INFO, "User input number2: " + num2);
                switch (operation) {
                    case "+":
                        result = num1 + num2;
                        logger.log(Level.INFO, "User input operation: +");
                        break;
                    case "-":
                        logger.log(Level.INFO, "User input operation: -");
                        result = num1 - num2;
                        break;
                    case "/":
                        result = num1 / num2;
                        logger.log(Level.INFO, "User input operation: /");
                        break;
                    case "*":
                        result = num1 * num2;
                        logger.log(Level.INFO, "User input operation: /");
                        break;
                    default:
                        logger.log(Level.INFO, " Oooops, something wrong !");
                        break;
                }
                System.out.print(" Enter number: ");
                logger.log(Level.INFO, "Result: " + result);
                System.out.printf(" Result = %.3f\n", result);
                num1 = result;
                dl.add(result);
                System.out.println(" Stack result" + dl);
            } else {
                if (dl.size() > 1) {
                    System.out.println(" Operation was Cancaled");              
                    dl.pollLast();
                    System.out.println(" Stack result" + dl);
                    result = (double) dl.getLast();
                    num1 = result;
                }
            }

        }

    }

}
