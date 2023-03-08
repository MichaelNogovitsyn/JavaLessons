import java.util.Arrays;
import java.util.Scanner;

/* Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
результат после каждой итерации запишите в лог-файл.     */
/**
 * taskDZ2_1
 */
public class taskDZ2_1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        String numStr = null;
        
        System.out.print("Enter nums via space as 1 2 3:");
        numStr = iScanner.nextLine();
        String[] splitStr = numStr.split(" ");
        System.out.println(Arrays.toString(splitStr));
        int[] numbers = new int[splitStr.length];
        for (int i = 0; i < splitStr.length; i++) {
            numbers[i] = Integer.parseInt(splitStr[i]);
        }              
        System.out.println(Arrays.toString(numbers)); 
    }
}