import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.*;
import java.util.logging.FileHandler;

/* Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
результат после каждой итерации запишите в лог-файл.     */
/**
 * taskDZ2_1
 */
public class taskDZ2_1 {

    public static void sortBubble(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1-i; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
                logger.log(Level.INFO, Arrays.toString(nums));
            }
        }
    }

    private static Logger logger = Logger.getLogger(taskDZ2_1.class.getName());
    FileHandler fh = new FileHandler("log.txt");

    public static void main(String[] args) throws IOException {
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.log(Level.INFO, "Start");
        Scanner iScanner = new Scanner(System.in);
        String numStr = null;

        System.out.print("Enter nums as 5 4 3 2 1 : ");
        numStr = iScanner.nextLine();
        String[] splitStr = numStr.split(" ");
        logger.log(Level.SEVERE, "input array");
        logger.log(Level.INFO, Arrays.toString(splitStr));
        // System.out.println(Arrays.toString(splitStr));
        int[] numbers = new int[splitStr.length];

        for (int i = 0; i < splitStr.length; i++) {
            numbers[i] = Integer.parseInt(splitStr[i]);
        }
        System.out.println(Arrays.toString(numbers));
        sortBubble(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}