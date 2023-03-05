/* Реализовать простой калькулятор (+ - / *)
Ввод числа ->
Ввод знака ->
Ввод числа -> */

import java.util.Scanner;

public class taskDZ3 {
    public static void main(String[] args) {
        Scanner iScanner =new Scanner(System.in);
        System.out.print(" Enter number: ");
        double num1 = iScanner.nextInt();
        System.out.print(" Enter operation: ");
        String operation = iScanner.next();
        System.out.print(" Enter number: ");
        double num2 = iScanner.nextInt();
        double result=0;

        switch (operation) {
            case "+":
            result = num1+num2;  
                break;
            case "-":
            result = num1-num2;  
                break;
            case "/":
            result = num1/num2;  
                break;
            case "*":
            result = num1*num2;  
                break;
        
            default:
            System.out.println(" Oooops, something wrong !");
                break;
        }
        System.out.printf(" Result = %.3f",result);

    }
    
}
