/* Реализовать простой калькулятор (+ - / *)
Ввод числа ->
Ввод знака ->
Ввод числа -> 
3*дополнительно. К калькулятору из предыдущего дз добавить логирование.
1 + 3 = 4
4 + 3 = 7 */
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.*;
import java.util.logging.FileHandler;

public class taskDZ3 {

    private static Logger logger = Logger.getLogger(taskDZ3.class.getName());
    FileHandler fh = new FileHandler("log.txt");
    public static void main(String[] args) throws IOException{
        FileHandler fh = new FileHandler("log.txt",true);
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
       
        logger.log(Level.INFO, "Start");

        Scanner iScanner =new Scanner(System.in);
        System.out.print(" Enter number: ");
        double num1 = iScanner.nextInt();
        logger.log(Level.INFO,"User input number1: "+ num1);
        System.out.print(" Enter operation: ");
        String operation = iScanner.next();
        System.out.print(" Enter number: ");
        double num2 = iScanner.nextInt();
        logger.log(Level.INFO,"User input number2: "+ num2);
        double result=0;

        switch (operation) {
            case "+":
            result = num1+num2; 
            logger.log(Level.INFO,"User input operation: +"); 
                break;
            case "-":
            logger.log(Level.INFO,"User input operation: -");
            result = num1-num2;  
                break;
            case "/":
            result = num1/num2;
            logger.log(Level.INFO,"User input operation: /");  
                break;
            case "*":
            result = num1*num2;  
            logger.log(Level.INFO,"User input operation: /");
                break;
        
            default:
            logger.log(Level.INFO," Oooops, something wrong !");
                break;
        }
        logger.log(Level.INFO,"Result: " + result );
        System.out.printf(" Result = %.3f",result);

    }
    
}
